package third;

import second.lab;

/**
 * The type Uni.
 */
public class uni {
    // array of labs
    private lab[] labs;
    // name of uni
    private String name;
    // information about uni
    private String sessionInfo;

    /**
     * Instantiates a new Uni.
     *
     * @param name the name
     */
    public uni(String name) {
        this.name = name;
    }

    /**
     * Get labs lab.
     *
     * @return the lab
     */
    public lab[] getLabs() {
        return labs;
    }

    /**
     * Sets labs.
     *
     * @param labs the labs
     */
    public void setLabs(lab[] labs) {
        this.labs = labs;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets session info.
     *
     * @return the session info
     */
    public String getSessionInfo() {
        return sessionInfo;
    }

    /**
     * Sets session info.
     *
     * @param sessionInfo the session info
     */
    public void setSessionInfo(String sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    /**
     * Check for to uni with same name.
     *
     * @param u1 the u 1
     * @param u2 the u 2
     */
    public void check(uni u1, uni u2){
        if (u1.name.equals(u2.name)){
            System.out.println("there is a uni with same name");
        }
    }
}
