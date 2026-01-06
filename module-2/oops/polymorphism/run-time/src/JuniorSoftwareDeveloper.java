class JuniorSoftwareDeveloper extends SeniorSoftwareDeveloper {
    @Override
    public Laptop workDevice(){
        return new Laptop();
    }
}
