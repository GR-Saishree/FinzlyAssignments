 export class AccessPublicFunctions{
    public display(){
    console.log(`
    This is a public display method
    `);
    }
    
}

export class AccessProtectedFunctions{
    protected displays(){
        console.log(`
        This is a protected display method
        `);
        
    }
}

export class AccessPrivateFunctions{
    private displaying(){
        console.log(`
        This is a private display method
        `);
        
    }
}