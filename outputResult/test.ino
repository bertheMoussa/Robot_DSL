
        #include <PinChangeInt.h>
        #include <PinChangeIntConfig.h>
        #include <EEPROM.h>
        #define _NAMIKI_MOTOR	 //for Namiki 22CL-103501PG80:1
        #include <fuzzy_table.h>
        #include <PID_Beta6.h>
        #include <MotorWheel.h>
        #include <Omni4WD.h>
        
        //#include <fuzzy_table.h>
        //#include <PID_Beta6.h>
        
        /*
        
                                        /
        wheel1                       /   wheel4
        Left                         /   Right
        
        
                                    power switch
        
                    /                            wheel2   /                       wheel3
        Right    /                       Left
        
        */
        
        /*
        irqISR(irq1,isr1);
        MotorWheel wheel1(5,4,12,13,&irq1);
        
        irqISR(irq2,isr2);
        MotorWheel wheel2(6,7,14,15,&irq2);
        
        irqISR(irq3,isr3);
        MotorWheel wheel3(9,8,16,17,&irq3);
        
        irqISR(irq4,isr4);
        MotorWheel wheel4(10,11,18,19,&irq4);
        */
        
        irqISR(irq1, isr1);
        MotorWheel wheel1(3, 2, 4, 5, &irq1);
        
        irqISR(irq2, isr2);
        MotorWheel wheel2(11, 12, 14, 15, &irq2);
        
        irqISR(irq3, isr3);
        MotorWheel wheel3(9, 8, 16, 17, &irq3);
        
        irqISR(irq4, isr4);
        MotorWheel wheel4(10, 7, 18, 19, &irq4);
        
        
        Omni4WD Omni(&wheel1, &wheel2, &wheel3, &wheel4);

        void setup() {
            //TCCR0B=TCCR0B&0xf8|0x01;    // warning!! it will change millis()
            TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
            TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz
            
            Omni.PIDEnable(0.31, 0.01, 0, 10);
        }



        void forward_advance(int distance) {
            Omni.setCarAdvance(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void backward_advance(int distance) {
            Omni.setCarBackoff(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void left_advance(int distance) {
            Omni.setCarLeft(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void right_advance(int distance) {
            Omni.setCarRight(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void rotation(int angle) {
            if (angle > 0) {
                Omni.setCarRotateRight(Omni.getCarSpeedMMPS());
            } else {
                Omni.setCarRotateLeft(Omni.getCarSpeedMMPS());
            }
    
            int circumference = wheel1.getCirMM();
            int distance = (angle / 360.0) * circumference;
            int waitTime = (distance / Omni.getCarSpeedMMPS()) * 1000;
            Omni.delayMS(timeToWait);
            Omni.setCarStop();
        }

void entry(){

	Omni.setCarSpeedMMPS(200);
	float temp = millis();
	while (temp<60000)
	{

	float dist = 1000-125;
	forward_advance(dist);
	rotation(90);
	temp=millis();
	}

}
void simpleFunction(){

	bool flag = true;
	float value = 10;
	if(flag)
	{

	value=value+5;
	}else{
	value=value-5;
	}

}
float addNumbers(float a, float b){

	float c = a+b;
	return c;

}
float sumLoop(){

	float sum = 0;
	for(float i = 0;i<5;i=i+1)
	{

	sum=sum+i;
	}
	return sum;

}

