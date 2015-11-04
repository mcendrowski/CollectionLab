/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionlab;

/**
 *
 * @author instlogin
 */
public class Dog implements NameStrategy {
    private String name;
    private int rabiesId;

    public Dog() {
    }

    public Dog(String name, int rabiesId) {
        this.name = name;
        this.rabiesId = rabiesId;
    }
    

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public String toString() {
        return name + ", rabiesId=" + rabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.rabiesId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (this.rabiesId != other.rabiesId) {
            return false;
        }
        return true;
    }
    

    

}
