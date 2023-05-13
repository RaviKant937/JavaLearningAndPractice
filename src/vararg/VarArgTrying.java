package vararg;

public class VarArgTrying {
    public void varArgMehod(String... args){
        for(String str: args){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        VarArgTrying varArgTrying = new VarArgTrying();
        varArgTrying.varArgMehod("asdf","sdfd","sdfd");
    }
}
