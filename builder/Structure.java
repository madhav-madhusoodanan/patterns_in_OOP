/* Only the structure has been described here

    Much of the interface implementations have been omitted here for cleanliness
    
    Navigate to Full.java to see the full implementation

    1. The builders can manipulate the house composition
    2. The director tells the builder to go through a specific sequence of manipulations
    3. There is a builder for each variant of the product (here, it is houses)
    4. In the end, the builder presents the product, in the main function
 */

/* ============================================= Builder interface ============================================= */
interface Builder {
    public void reset();
    public void setWalls(Integer count);
    public void setDoors(Integer count);
    public void setWindows(Integer count);
    public void setFloors(Integer count);
}

/* ============================================= Concrete builder classes ============================================= */
class MediaevalBuilder implements Builder {
    public MediaevalHouse present(){}
}
class ModernBuilder implements Builder {
    public ModernHouse present(){}
}

/* ============================================= Director class (not necessary if complexity is less) ============================================= */
class Director {
    public Builder buildBigHouse(Builder builder){}
    public Builder buildSmallHouse(Builder builder){}
}

/* ============================================= Product classes ============================================= */
class MediaevalHouse {}
class ModernHouse {}


class Structure {
    public static void main(String[] args){
        Director dc = new Director();
        MediaevalBuilder builder1 = new MediaevalBuilder();
        ModernBuilder builder2 = new ModernBuilder();

        dc.buildBigHouse(builder1);
        dc.buildSmallHouse(builder2);

        MediaevalHouse house1 = builder1.present();
        ModernHouse house2 = builder2.present();
    }
}