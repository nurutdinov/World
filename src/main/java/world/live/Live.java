package world.live;

import java.util.Date;

public abstract class Live implements Growth, Nutrition, Reproduction {
    private Date birthDate;
    private Date age;

    private boolean satiety;

    public Date ageIs(Date birthDate) {
        if(birthDate != null) {
            Date today = new Date();
            Date age = new Date();
            age.setTime(today.getTime() - birthDate.getTime());
            return age;
        } else return null;
    }

    public Date birthDateIs(Date age) {
        if(age != null) {
            Date today = new Date();
            Date birthDate = new Date();
            birthDate.setTime(today.getTime() - age.getTime());
            return birthDate;
        } else return null;
    }

    public void eat(Object food) {
        if(food != null) {
            if (isEat(food)) {

            }
        }
    }

    public void drink(Object fluid) {
        if(fluid != null) {
            if (isDrink(fluid)) {

            }
        }
    }

    public boolean isEat(Object food) {
        return false;
    }

    public boolean isDrink(Object fluid) {
        return false;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
