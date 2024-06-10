package mypack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.print("-->");
        System.out.println(name + ":$" + bal);
    }
}

class AccountBalance {
    public static void mani(String[] args) {
        Balance[] current = new Balance[3];
    }

}
