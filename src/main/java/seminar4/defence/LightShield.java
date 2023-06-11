package seminar4.defence;

public class LightShield extends Shield{
    @Override
    public int getDefence() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Defence: %d", getDefence());
    }
}
