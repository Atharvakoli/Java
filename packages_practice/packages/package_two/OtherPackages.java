package packages_practice.packages.package_two;

class OtherPackages {
    OtherPackages() {
        packages_practice.packages.package_one.Protection p = new packages_practice.packages.package_one.Protection();
        System.out.println("other package constructor");
        // class or package only
        // System.out.println("n = " + p.n);
        // class only
        // System.out.println("n_pri = " + p.n_pri);
        // class, subclass or package only
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
