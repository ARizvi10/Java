public class Block {

    int mass;
    int velocity;

    public Block (int mass, int velocity) {
        this.mass = mass;
        this.velocity = velocity;

    }

    public static void main (String[] args) {

        Block block1 = new Block(5, 10);
        System.out.println("The momentum of a block with " + block1.mass + "kg mass at " + block1.velocity + "m/s velocity is " + calculateMomentum(block1) + "kg m/s");
        int acceleration = calculateAcceleration(block1, 12,1);
        System.out.println("The block is accelerating at a rate of " + acceleration + "m/s^2 to a velocity of " + (block1.velocity + acceleration) + "m/s");
        System.out.println("The block with a mass of " + block1.mass + "kg and an acceleration of " + acceleration + "m/s^2 exerts a force of " + calculateForce(block1, acceleration) + " Newtons");

    }

    public static int calculateMomentum(Block block){
        //calculates the momentum of a block given its mass and current velocity
        return block.mass * block.velocity;
    }

    public static int calculateAcceleration(Block block, int newVelocity, int timeElapsed){
        //calculates the acceleration in m/s^2 of a block given the new velocity and the delta time between the two velocities
        return (newVelocity - block.velocity)/timeElapsed;
    }

    public static int calculateForce (Block block, int acceleration){
        //calculates the force in newtons of a block given its acceleration UPDATE THIS TO CALL THE CALCULATE METHOD INSTEAD, OR RETRIEVE THE INFO FROM THE OBJ SO STORE
        //THE ACCELERATION IN THE OBJECT AFTER CALCULATION
        return block.mass * acceleration;
    }
}
