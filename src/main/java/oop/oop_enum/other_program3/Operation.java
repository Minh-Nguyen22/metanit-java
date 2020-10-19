package oop.oop_enum.other_program3;

public enum Operation {

    SUM{
        public int action(int x, int y){
            return x+y;
        }
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);

}
