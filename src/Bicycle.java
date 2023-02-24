public class Bicycle extends Vehicle implements TransportTyre {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() { // этот метод тоже одинаковый для всех,
        // поэтому его я тоже объединила в тот же интерфейс
        System.out.println("Меняем покрышку");
    }

}