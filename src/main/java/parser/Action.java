package parser;

public class Action {
    public act action;
    //if action = shift : number is state
    //if action = reduce : number is number of rule
    public int number;

    public Action(act action, int number) {
        this.action = action;
        this.number = number;
    }

    public String toString() {
        return action.getNum(number);
    }
}

enum act {
    shift {
        public String getNum(int num) {
            return "s" + num;
        }
    }, reduce {
        public String getNum(int num) {
            return "r" + num;
        }
    }, accept {
        public String getNum(int num) {
            return "acc";
        }
    };

    public abstract String getNum(int num);

}
