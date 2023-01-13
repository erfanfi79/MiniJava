package codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public enum TypeAddress {
    Direct {
        public String getNum(int num) {
            return num + "";
        }
    }, Indirect {
        public String getNum(int num) {
            return "@" + num;
        }
    }, Immediate {
        public String getNum(int num) {
            return "#" + num;
        }
    };

    public abstract String getNum(int num);
}