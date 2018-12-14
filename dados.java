import javax.swing.JOptionPane;
class dados
{
   public static void main(String args[])
   {
      float salario;
      int idade;
      String nome;

      nome = JOptionPane.showInputDialog("Digite seu nome");
      idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
      salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario: "));
      System.out.println("Bem vindo "+nome+ " sua idade é "+idade+" anos e você ganha "+salario+" reais");
      JOptionPane.showMessageDialog(null,"Bem vindo "+nome+ " sua idade é "+idade+" anos e você ganha "+salario+" reais");
   }
}