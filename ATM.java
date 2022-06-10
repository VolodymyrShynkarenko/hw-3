public class ATM {
    public int countBanknotes(int sum) {

        int[] denomination = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int rest;
        int value=0;
        for(int i = 0; i < 9; ++i) //цикл перебирает все элементы массива, от большего к меньшему
        {
            rest = denomination[i];
            value += sum / rest; //считаем, сколько раз входит купюра в сумму
            sum %= rest;  //сумме присваивается остаток от деления на данную купюр
        }
       if(sum > 0) value = -1; //проверяем наличие остатка, который банкомат не сможет выдать
        return value;
    }

    public static void main(String[] args) {
        ATM helper = new ATM();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.countBanknotes( 8988));
    }
}
