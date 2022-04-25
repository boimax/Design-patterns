public class GumballMachine {
    State state;
    int count = 0;

    public GumballMachine(int numberOfBalls) {
        NoQuarterState noQuarterState = new NoQuarterState(this);
        HasQuarterState hasQuarterState = new HasQuarterState(this);
        SoldState soldState = newSoldState(this);
        SoldOutState soldOutState = newSoldOutState(this);

        this.count = numberOfBalls;
        if (numberOfBalls > 0) {
            state = noQuarterState;
        }
        else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    GumballMachine getNoQuarterState() {
        return noQuarterState;
    }

    GumballMachine getHasQuarterState() {
        return hasQuarterState;
    }

    GumballMachine getSoldState() {
        return SoldState;
    }

    GumballMachine getSoldOutState() {
        return SoldOutState;
    }

    public void releaseaBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
