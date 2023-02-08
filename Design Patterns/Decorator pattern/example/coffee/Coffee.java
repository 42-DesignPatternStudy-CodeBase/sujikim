public abstract class Coffee {
    
    protected Bean bean;
    protected String name;

    public Coffee(Bean bean) {
        this.bean = bean;
    }

    public String getName() {
        return bean.getName() + this.name;
    }
}
