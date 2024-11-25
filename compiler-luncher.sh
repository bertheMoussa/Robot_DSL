npm run langium:generate
npm run build
node ./bin/cli compile ./exemples/test.robot | tail -n +37 > ./outputResult/test.ino
