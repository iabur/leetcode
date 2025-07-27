package greedy;

public class Main {
    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        boolean result = jumpGame.canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(result);
    }
}
