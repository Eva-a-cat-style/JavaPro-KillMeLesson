public class GameLimiter {
    private int attemptsLeft;

    public GameLimiter(int maxAttempts) {
        this.attemptsLeft = maxAttempts;
    }

    public int useAttempt() {
        if (attemptsLeft > 0) {
            attemptsLeft--;
        }
        return attemptsLeft;
    }

    public boolean isOutOfAttempts() {
        return attemptsLeft <= 0;
    }
}