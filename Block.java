public class Block {

    double mass;
    double velocity;
    double acceleration;
    double momentum;
    double gravity = 9.807;

    public Block (double mass, double velocity) {
        this.mass = mass;
        this.velocity = velocity;


    }

    public static void main (String[] args) {

        Block block1 = new Block(5, 10);
        block1.setMomentum(block1, block1.calculateMomentum(block1));
        block1.setAcceleration(block1, block1.calculateAcceleration(block1, 12,1));
        printNewtonForces(block1);

    }

    public static void printNewtonForces(Block block) {
        System.out.println("The momentum of a block with " + block.mass + "kg mass at " + block.velocity + "m/s velocity is " + block.momentum + "kg m/s");
        System.out.println("The block is accelerating at a rate of " + block.acceleration + "m/s^2 to a velocity of " + (block.velocity + block.acceleration) + "m/s");
        System.out.println("The block with a mass of " + block.mass + "kg and an acceleration of " + block.acceleration + "m/s^2 has been acted on by a force of " + block.calculateForce(block, block.acceleration) + " Newtons");
        System.out.println("The acceleration due to gravity acting on the block is " + block.gravity + "m/s towards Earth");
    }

    public double calculateMomentum(Block block){
        //calculates the momentum of a block given its mass and current velocity
        return block.mass * block.velocity;
    }

    public double calculateAcceleration(Block block, double newVelocity, double timeElapsed){
        //calculates the acceleration in m/s^2 of a block given the new velocity and the delta time between the two velocities
        return (newVelocity - block.velocity)/timeElapsed;
    }

    public double calculateForce (Block block, double acceleration){
        //calculates the force in newtons of a block given its acceleration UPDATE THIS TO CALL THE CALCULATE METHOD INSTEAD, OR RETRIEVE THE INFO FROM THE OBJ SO STORE
        //THE ACCELERATION IN THE OBJECT AFTER CALCULATION
        return block.mass * acceleration;
    }

    public void setMass (Block block, double mass){
        block.mass = mass;
    }

    public double getMass(Block block){
        return block.mass;
    }

    public void setVelocity(Block block, double velocity){
        block.velocity = velocity;
    }

    public double getVelocity(Block block){
        return block.velocity;
    }

    public void setAcceleration (Block block, double acceleration){
        block.acceleration = acceleration;
    }

    public double getAcceleration (Block block) {
        return block.acceleration;
    }

    public void setMomentum(Block block, double momentum) {
        block.momentum = momentum;
    }

    public double getMomentum(Block block){
        return block.momentum;
    }

}
