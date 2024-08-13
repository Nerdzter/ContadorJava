import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorApp {
    private int contador = 0;
    private JLabel labelContador;
    
    public ContadorApp() {
        // Criação do JFrame
        JFrame frame = new JFrame("Contador Simples");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // Criação do JLabel para mostrar o contador
        labelContador = new JLabel("Contador: " + contador);
        labelContador.setBounds(100, 30, 100, 30);
        frame.add(labelContador);
        
        // Criação do botão Incrementar
        JButton botaoIncrementar = new JButton("Incrementar");
        botaoIncrementar.setBounds(50, 100, 100, 30);
        botaoIncrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                atualizarLabel();
            }
        });
        frame.add(botaoIncrementar);
        
        // Criação do botão Decrementar
        JButton botaoDecrementar = new JButton("Decrementar");
        botaoDecrementar.setBounds(150, 100, 100, 30);
        botaoDecrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador--;
                atualizarLabel();
            }
        });
        frame.add(botaoDecrementar);
        
        // Configurar visibilidade
        frame.setVisible(true);
    }
    
    private void atualizarLabel() {
        labelContador.setText("Contador: " + contador);
    }
    
    public static void main(String[] args) {
        // Inicializar a interface gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContadorApp();
            }
        });
    }
}
