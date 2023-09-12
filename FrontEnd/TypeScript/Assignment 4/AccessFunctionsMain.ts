import { AccessPublicFunctions, AccessPrivateFunctions, AccessProtectedFunctions} from "./AccessFunctions/AccessFunction";

let publicObj = new AccessPublicFunctions();
publicObj.display();

class AccessingProtectedFunction extends AccessProtectedFunctions{

    constructor(){
        super();
        this.displays();
    }
}

let instance = new AccessingProtectedFunction();



/*
We cannot access private methods outside the class

let privateObj = new AccessPrivateFunctions();
privateObj.displaying(); */