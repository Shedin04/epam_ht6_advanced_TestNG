    package com.epam.test.automation.java.practice6;

    import java.math.BigDecimal;

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     */
    public class Manager extends Employee implements Info {
        private int quantity;

        public Manager(String name, BigDecimal salary, int clientAmount) {
            super(name, salary);
            this.quantity = clientAmount;
        }

        @Override
        public void setBonus(BigDecimal bonus) {
            if (bonus==null) throw new IllegalArgumentException();
            if (bonus.compareTo(new BigDecimal(0)) < 0) throw new IllegalArgumentException();
            if (quantity>100 && quantity<=150) bonus=bonus.add(new BigDecimal(500));
            if (quantity>150) bonus=bonus.add(new BigDecimal(1000));
            this.bonus = bonus;
        }

        @Override
        public void showInfo() {
            System.out.println("Manager: " + getName() + " | Salary: " + getSalary() + " | Bonus: " + getBonus() + " | To pay: " +  toPay());
        }
    }