package RESTORAAN;


class Stol{
    int vmestimost;
    boolean notfree;
    int nomerStola;

    public Stol(int vmestimost, int nomerStola){ // Конструктор для инициализации стола
        if(vmestimost<1){ // Проверяем, если вместимость меньше 1, устанавливаем минимальную вместимость = 1
            this.vmestimost=1; // Устанавливаем минимальную вместимость
            this.notfree=true; // Стол занят по умолчанию (вместимость 1)
            this.nomerStola=nomerStola; // Номер стола
        }
        else{
            this.vmestimost=vmestimost; // Устанавливаем указанную вместимость
            this.notfree=false; // Стол свободен
            this.nomerStola=nomerStola; // Номер стола
        }
    }

    public int getVmestimost(){
        return vmestimost; // Возвращаем вместимость стола
    }

    public boolean getNotfree(){
        return notfree;  // Возвращаем, занят ли стол
    }

    public void zanat() {
        this.notfree = true;  // Помечаем стол как занятый
    }

    public void nezanat() {
        this.notfree = false; // Помечаем стол как свободный
    }
}
