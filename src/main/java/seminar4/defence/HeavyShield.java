package seminar4.defence;

public class HeavyShield extends Shield{
    @Override
    public int getDefence() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Defence: %d", getDefence());
    }
}
