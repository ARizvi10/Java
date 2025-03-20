public class Block {

    int mass;
    int velocity;
    int acceleration;
    int momentum;

    public Block (int mass, int velocity) {
        this.mass = mass;
        this.velocity = velocity;


    }

    public static void main (String[] args) {

        Block block1 = new Block(5, 10);
        block1.setMomentum(block1, block1.calculateMomentum(block1));
        System.out.println("The momentum of a block with " + block1.mass + "kg mass at " + block1.velocity + "m/s velocity is " + block1.momentum + "kg m/s");
        block1.setAcceleration(block1, block1.calculateAcceleration(block1, 12,1));
        System.out.println("The block is accelerating at a rate of " + block1.acceleration + "m/s^2 to a velocity of " + (block1.velocity + block1.acceleration) + "m/s");
        System.out.println("The block with a mass of " + block1.mass + "kg and an acceleration of " + block1.acceleration + "m/s^2 exerts a force of " + block1.calculateForce(block1, block1.acceleration) + " Newtons");

    }

    public int calculateMomentum(Block block){
        //calculates the momentum of a block given its mass and current velocity
        return block.mass * block.velocity;
    }

    public int calculateAcceleration(Block block, int newVelocity, int timeElapsed){
        //calculates the acceleration in m/s^2 of a block given the new velocity and the delta time between the two velocities
        return (newVelocity - block.velocity)/timeElapsed;
    }

    public int calculateForce (Block block, int acceleration){
        //calculates the force in newtons of a block given its acceleration UPDATE THIS TO CALL THE CALCULATE METHOD INSTEAD, OR RETRIEVE THE INFO FROM THE OBJ SO STORE
        //THE ACCELERATION IN THE OBJECT AFTER CALCULATION
        return block.mass * acceleration;
    }

    public void setMass (Block block, int mass){
        block.mass = mass;
    }

    public int getMass(Block block){
        return block.mass;
    }

    public void setVelocity(Block block, int velocity){
        block.velocity = velocity;
    }

    public int getVelocity(Block block){
        return block.velocity;
    }

    public void setAcceleration (Block block, int acceleration){
        block.acceleration = acceleration;
    }

    public int getAcceleration (Block block) {
        return block.acceleration;
    }

    public void setMomentum(Block block, int momentum) {
        block.momentum = momentum;
    }

    public int getMomentum(Block block){
        return block.momentum;
    }

}
