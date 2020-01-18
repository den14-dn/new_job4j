package ru.job4j.pojo;

public class Shop {
    public Product[] delete(Product[] products, int index) {
        for ( ; index < products.length; index++) {
            if (products.length == (index + 1)) {
                products[products.length - 1] = null;
                break;
            }
            products[index] = products[index + 1];
        }
        return products;
    }

    public static void main(String[] args) {
        Product products[] = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            }
        }

        System.out.println("Удаляем значение из ячейки с индексом 1");
        products[1] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
        products[1] = products[2];
        products[2] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Через метод delete удалим элемент массива с индексом 1. Элементы справа сместим на 1 элемент");
        Shop shop = new Shop();
        shop.delete(products, 1);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
