

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
    MediaevalHouse house;
    MediaevalBuilder(){
        house = new MediaevalHouse();
    }
    @Override
    public void reset(){
        house = new MediaevalHouse();
    }

    @Override
    public void setWalls(Integer count){
        house.walls = count;
    }
    @Override
    public void setWindows(Integer count){
        house.windows = count;
    }
    @Override
    public void setDoors(Integer count){
        house.doors = count;
    }
    @Override
    public void setFloors(Integer count){
        house.floors = count;
    }
    public MediaevalHouse present(){
        return house;
    }
}

class ModernBuilder implements Builder {
    ModernHouse house;
    ModernBuilder(){
        house = new ModernHouse();
    }
    @Override
    public void reset(){
        house = new ModernHouse();
    }

    @Override
    public void setWalls(Integer count){
        house.walls = count;
    }
    @Override
    public void setWindows(Integer count){
        house.windows = count;
    }
    @Override
    public void setDoors(Integer count){
        house.doors = count;
    }
    @Override
    public void setFloors(Integer count){
        house.floors = count;
    }
    public ModernHouse present(){
        return house;
    }
}

/* ============================================= Director class (not necessary if complexity is less) ============================================= */
class Director {
    public Builder buildBigHouse(Builder builder){
        builder.setDoors(8);
        builder.setFloors(8);
        builder.setWalls(16);
        builder.setWindows(8);

        return builder;
    }
    public Builder buildSmallHouse(Builder builder){
        builder.setDoors(1);
        builder.setFloors(1);
        builder.setWalls(4);
        builder.setWindows(1);
        
        return builder;
    }
}

/* ============================================= Product classes ============================================= */
class MediaevalHouse {
    public Integer walls;
    public Integer doors;
    public Integer windows;
    public Integer floors;
    MediaevalHouse(){
        walls = 0;
        doors = 0;
        windows = 0;
        floors = 0;
    }
}
class ModernHouse {
    public Integer walls;
    public Integer doors;
    public Integer windows;
    public Integer floors;

    ModernHouse(){
        walls = 0;
        doors = 0;
        windows = 0;
        floors = 0;
    }
}


class Full {
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