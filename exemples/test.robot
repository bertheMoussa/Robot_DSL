
program {

let void entry () {
    setSpeed(150 mm) // distance per second (here 150mm/s)
    var number count = 0
    loop count < 5
    {	
        count = count + 1
        square()
    }
}

let void square() {
    Forward 30 in cm
    Rotate 90
    Forward 300 in mm
    Rotate 90
}
}



