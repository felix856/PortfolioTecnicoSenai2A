#Dev: Félix Francisco
public class Animal {
    int matricula;
    String nome;
    String cor_pelagem;
    String genero;
    int idade;
    float peso;
    boolean vacinado;
    
    
}
/**
 *
 * @author Felix Francisco
 */
public class Cachorro extends Animal{
    boolean focinheira;
    String estilo_rabo;
    boolean castrado;

    public boolean isFocinheira() {
        return focinheira;
    }

    public void setFocinheira(boolean focinheira) {
        this.focinheira = focinheira;
    }

    public String getEstilo_rabo() {
        return estilo_rabo;
    }

    public void setEstilo_rabo(String estilo_rabo) {
        this.estilo_rabo = estilo_rabo;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor_pelagem() {
        return cor_pelagem;
    }

    public void setCor_pelagem(String cor_pelagem) {
        this.cor_pelagem = cor_pelagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
/**
 *
 * @author felix_francisco
 */
public class Felinos extends Animal{
    boolean tipo_especie;
    boolean castrado;

    public boolean isTipo_especie() {
        return tipo_especie;
    }

    public Felinos(boolean tipo_especie, boolean castrado) {
        this.tipo_especie = tipo_especie;
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public void setTipo_especie(boolean tipo_especie) {
        this.tipo_especie = tipo_especie;
    }
    
   public boolean istipo_especie() {
        return tipo_especie;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor_pelagem() {
        return cor_pelagem;
    }

    public void setCor_pelagem(String cor_pelagem) {
        this.cor_pelagem = cor_pelagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public void settipo_especie(boolean tipo_especie) {
        this.tipo_especie = tipo_especie;
    }
}

public class Roedores extends Animal {
    boolean domest_selvag;
    boolean castrado;

    public Roedores(boolean domest_selvag, boolean castrado) {
        this.domest_selvag = domest_selvag;
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    public boolean isDomest_selvag() {
        return domest_selvag;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor_pelagem() {
        return cor_pelagem;
    }

    public void setCor_pelagem(String cor_pelagem) {
        this.cor_pelagem = cor_pelagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public void setDomest_selvag(boolean domest_selvag) {
        this.domest_selvag = domest_selvag;
    }
}

    


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author felix_francisco
 */
public class Cadastro extends javax.swing.JFrame {

    ArrayList<Cachorro> cachorro = new ArrayList<Cachorro>();
    ArrayList<Felinos> felinos = new ArrayList<Felinos>();
    ArrayList<Roedores> roedores = new ArrayList<Roedores>();
    ArrayList<Aves> aves = new ArrayList<Aves>();

    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campomatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campocor = new javax.swing.JTextField();
        campogenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campopeso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        camporabo = new javax.swing.JTextField();
        isfocinheira = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        iscastrado = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        botaoremove = new javax.swing.JButton();
        botaolista = new javax.swing.JButton();
        botaocadastra = new javax.swing.JButton();
        Alternarfelinos = new javax.swing.JToggleButton();
        Alternarcaes = new javax.swing.JToggleButton();
        Alternarroedores = new javax.swing.JToggleButton();
        alteraraves = new javax.swing.JToggleButton();

        jLabel6.setText("Genero:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro do Pet Shop");

        jLabel2.setText("Nome:");

        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Matricula: ");

        campomatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campomatriculaActionPerformed(evt);
            }
        });

        jLabel4.setText("Cor da pelagem: ");

        jLabel5.setText("Genero:");

        jLabel7.setText("Idade:");

        jLabel8.setText("Peso:");

        jLabel9.setText("Estilo de rabo:");

        isfocinheira.setMaximum(1);

        jLabel10.setText("Focinheira:");

        jLabel11.setText("NÃO");

        jLabel12.setText("SIM");

        jLabel13.setText("Castrado:");

        jLabel14.setText("NÃO");

        iscastrado.setMaximum(1);

        jLabel15.setText("SIM");

        botaoremove.setText("Remover");
        botaoremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoremoveActionPerformed(evt);
            }
        });

        botaolista.setText("Listar");
        botaolista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolistaActionPerformed(evt);
            }
        });

        botaocadastra.setText("Cadastrar");
        botaocadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastraActionPerformed(evt);
            }
        });

        Alternarfelinos.setText("Felinos");
        Alternarfelinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternarfelinosActionPerformed(evt);
            }
        });

        Alternarcaes.setText("Cães");
        Alternarcaes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternarcaesActionPerformed(evt);
            }
        });

        Alternarroedores.setText("Roedores");
        Alternarroedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternarroedoresActionPerformed(evt);
            }
        });

        alteraraves.setText("Aves");
        alteraraves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteraravesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)))
                .addGap(98, 98, 98)
                .addComponent(campoidade)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campomatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campogenero))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(campopeso)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(botaocadastra))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(Alternarcaes)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camporabo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(campocor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(botaoremove))
                                            .addComponent(Alternarroedores, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaolista, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                                .addGap(33, 33, 33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(alteraraves)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Alternarfelinos)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(isfocinheira, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel12)))
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addGap(29, 29, 29)
                                        .addComponent(iscastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel15)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13))
                    .addComponent(iscastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(campomatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(campogenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(campocor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(campoidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(campopeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(camporabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(isfocinheira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alternarroedores)
                            .addComponent(Alternarfelinos)
                            .addComponent(Alternarcaes))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoremove)
                            .addComponent(botaocadastra))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(alteraraves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaolista))))
        );

        pack();
    }// </editor-fold>                        

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {                                          
     
    }                                         

    private void campomatriculaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              
    public boolean verificaMatricula(int matricula) {
        for (Cachorro c : cachorro  ) {
            if (c.getMatricula() == matricula
                  ) {
                return false;
            }
        }
        return true;
    }
    private void botaolistaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String result = "";
        for (Cachorro c : cachorro) {
            result += "------------\n";
            result += "Nome: " + c.getNome() + "\n";
            result += "Matricula: " + c.getMatricula() + "\n";
            result += "Idade: " + c.getIdade() + "\n";
            
        }                
        JOptionPane.showMessageDialog(this, result);
    }                                          

    private void botaoremoveActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matricula do cachorro que deseja remover?"));
        for (Cachorro c : cachorro) {
            if (c.getMatricula() == matricula) {
                cachorro.remove(c);
                JOptionPane.showMessageDialog(this, "Removendo o cachorro" + c.getNome());
            }

        }
    }                                           

    private void botaocadastraActionPerformed(java.awt.event.ActionEvent evt) {                                              
if (verificaMatricula(Integer.parseInt(campomatricula.getText()))) {
            String nome = camponome.getText();
            String genero = campogenero.getText();
            String matricula = campomatricula.getText();
            int idade = Integer.parseInt(campoidade.getText());

            Cachorro c = new Cachorro();
            c.setNome(camponome.getText());
            c.setMatricula(Integer.parseInt(campomatricula.getText()));
            c.setFocinheira(isfocinheira.getValueIsAdjusting());
            c.setCastrado(iscastrado.getValueIsAdjusting());
            c.setCor_pelagem(campocor.getText());
            c.setGenero(campogenero.getText());
             c.setIdade(Integer.parseInt(campoidade.getText()));
            c.setPeso(Float.parseFloat(campopeso.getText()));
            cachorro.add(c);
            JOptionPane.showMessageDialog(this, "O animal foi cadastrado com sucesso");}
      else {
            JOptionPane.showMessageDialog(this, "O animal ja foi cadastrado");
        }
    }
                                            
    public boolean verificaMatriculaaves(int matricula) {
        for (Aves b : aves) {
            if (b.getMatricula() == matricula) {
                return false;
            }
}
return true;
    }                                             

    private void AlternarfelinosActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void AlternarroedoresActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void alteraravesActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void AlternarcaesActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton Alternarcaes;
    private javax.swing.JToggleButton Alternarfelinos;
    private javax.swing.JToggleButton Alternarroedores;
    private javax.swing.JToggleButton alteraraves;
    private javax.swing.JButton botaocadastra;
    private javax.swing.JButton botaolista;
    private javax.swing.JButton botaoremove;
    private javax.swing.JTextField campocor;
    private javax.swing.JTextField campogenero;
    private javax.swing.JTextField campoidade;
    private javax.swing.JTextField campomatricula;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campopeso;
    private javax.swing.JTextField camporabo;
    private javax.swing.JSlider iscastrado;
    private javax.swing.JSlider isfocinheira;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}

