package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Point;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.LineBorder;

import arquivos.*;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import java.awt.Dialog.ModalExclusionType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Tela {
	public JFrame frmTela;
	private JLabel lblNewLabel;
	public JButton btArquivo;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_3;
	public JButton btSalvar;
	public JButton btCompilar;
	private File file;
	private String campoTexto = null;
	private boolean controleArquivo = false; 
	private int contEnter = 1;
	private JTextArea tfArquivo;
	private JTextArea tfLineCount;
	private JTextArea tfArvore;
	private JTextArea tfConsole;
	private JScrollPane scrollPane_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmTela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.lookFeel();
		frmTela = new JFrame();
		frmTela.getContentPane().setForeground(Color.WHITE);
		frmTela.setTitle("Tela");
		frmTela.setBounds(100, 100, 1037, 590);
		frmTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTela.getContentPane().setLayout(null);
		
		btArquivo = new JButton("Arquivo");
		btArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfArquivo.getText().equals("") != true){
					int resp = JOptionPane.showConfirmDialog(null, "Salvar altera\u00e7\u00f5es? Caso não salve o arquivo sera perdido!!");
					
		
					if(resp ==0){
						 
	              	    if(file == null)
	              	    {
	              	     	salvarComo();
	              	    }else 
	              	    {
	              	      	salvar();
	              	    }
					} 
				}
				JFileChooser fc = new JFileChooser();
				int returnVal = fc.showOpenDialog(null);
				
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            file = fc.getSelectedFile().getAbsoluteFile();
		           
		            ReadFile read = new ReadFile();
		         
		            read.openFile(file);
		            tfArquivo.setText("");
		            campoTexto = new String();
		            campoTexto = read.readRecords();	            
		    		tfArquivo.append(campoTexto);
		    		controleArquivo = true;
		    		tfLineCount.setText("");
		    		contEnter = read.getContLinhaArquivo();
		    		contEnter++;
		    		tfLineCount.append(read.numLine());
		    		read.closeFile();
		        } 
			}
		});
		btArquivo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btArquivo.setBounds(46, 31, 121, 25);
		frmTela.getContentPane().add(btArquivo);
		
		lblNewLabel = new JLabel("Arquivo info");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setBounds(46, 66, 76, 13);
		frmTela.getContentPane().add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 89, 668, 278);
		frmTela.getContentPane().add(scrollPane);
		
		tfArquivo = new JTextArea();
		scrollPane.setViewportView(tfArquivo);
		tfArquivo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				
				if(arg0.getKeyCode() == 10){
					
				
					if(tfArquivo.getText().trim().equals("") != true){
					
						contEnter++;
				
						contaLinha(10);
					}
			
					else{
						tfLineCount.setText("");
					
						contEnter++;
			
						for(int i =1 ; i < contEnter; i++){
							tfLineCount.append(i + "\n");
						}
						tfLineCount.append(contEnter+"");
					}
				}
		
				if(arg0.getKeyCode() == 8){
		
					if(tfArquivo.getText().trim().equals("") != true){
			
						contEnter--;
		
						contaLinha(8);
					}
		
					else{
						tfLineCount.setText("");
				
						contEnter--;
				
						for(int i =1 ; i < contEnter; i++){
							tfLineCount.append(i + "\n");
						}
						tfLineCount.append(contEnter+"");	
	
						if(contEnter < 1){
							contEnter =1;
							tfLineCount.setText("1");
						}
					}
				}

				if(arg0.getKeyCode() == 38 || arg0.getKeyCode() == 40){
					Point point = scrollPane.getViewport().getViewPosition();  
					scrollPane_2.getViewport().setViewPosition(point);
				}
			}
		});
	
		
		
		lblNewLabel_1 = new JLabel("\u00C1rvore Sint\u00E1tica");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(724, 66, 93, 13);
		frmTela.getContentPane().add(lblNewLabel_1);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(724, 89, 276, 453);
		frmTela.getContentPane().add(scrollPane_1);
		
		tfArvore = new JTextArea();
		tfArvore.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 13));
		tfArvore.setForeground(new Color(0, 128, 0));
		tfArvore.setEditable(false);
		scrollPane_1.setViewportView(tfArvore);
		
		lblNewLabel_2 = new JLabel("Console");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 385, 45, 13);
		frmTela.getContentPane().add(lblNewLabel_2);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(20, 408, 694, 134);
		frmTela.getContentPane().add(scrollPane_3);
		
		tfConsole = new JTextArea();
		tfConsole.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		tfConsole.setForeground(Color.BLUE);
		tfConsole.setEditable(false);
		scrollPane_3.setViewportView(tfConsole);
		
		btSalvar = new JButton("Salvar");
		btSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfArquivo.getText().equals("") != true){
					
	
	              	    if(file == null)
	              	    {
	              	     	salvarComo();
	              	    }else 
	              	    {
	              	      	salvar();
	              	    }
					}
				}
		});
		btSalvar.setBounds(194, 31, 121, 25);
		frmTela.getContentPane().add(btSalvar);
		
		btCompilar = new JButton("Compilar");
		btCompilar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btCompilar.setBounds(593, 32, 121, 23);
		frmTela.getContentPane().add(btCompilar);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 90, 26, 277);
		frmTela.getContentPane().add(scrollPane_2);
		
		tfLineCount = new JTextArea();
		scrollPane_2.setViewportView(tfLineCount);
		tfLineCount.setBackground(Color.LIGHT_GRAY);
		tfLineCount.setEditable(false);
	}
	
	public JTextArea gettfArquivo(){
		return tfArquivo;
	}
	
	public void salvarComo(){

		JFileChooser jc = new JFileChooser();
		jc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int i= jc.showSaveDialog(null);
		

		if(i!=1) {
		
			file = jc.getSelectedFile();
			campoTexto = new String();	            
    		controleArquivo = true;
			CreateFile create = new CreateFile();
			
			create.openFile(file);
			create.addRecords(tfArquivo.getText());
			create.closeFile();
	
			
			campoTexto = tfArquivo.getText();
		}
	}
	
	public void contaLinha(int key){
		String[] separa = tfArquivo.getText().split("\n");
		tfLineCount.setText("");
		
	
		if(contEnter >= separa.length){
			for(int i =1 ; i < contEnter; i++){
				tfLineCount.append(i + "\n");
			}
			tfLineCount.append(contEnter+"");
		}else{
			for(int i =1 ; i < separa.length; i++){
				tfLineCount.append(i + "\n");
			}
			tfLineCount.append(separa.length+"");
			if(key ==10) tfLineCount.append((separa.length+1) + "");
			contEnter = separa.length;
		}
		
	}
	
	
	public void salvar(){
		campoTexto = new String();	            
		controleArquivo = true;
		
		if(file !=null){
			campoTexto = new String();	            
    		controleArquivo = true;
			CreateFile create = new CreateFile();
			
			create.openFile(file);
			create.addRecords(tfArquivo.getText());
			create.closeFile();
			
			campoTexto = tfArquivo.getText();
		}else{
			salvarComo();
		}	
	}
	
	public File getFile(){
		return file;
	}
	
	public JButton getCompilar() {
		return btCompilar;
	}
	
	public String getCampoTexto(){
		return campoTexto;
	}
	
	public void setCampoTexto(String campoTexto){
		this.campoTexto = campoTexto;
	}
	
	public boolean getControleArquivo(){return controleArquivo;}
	
	public void setControleArquivo(boolean controle){
		this.controleArquivo = controle;
	}
	
	public JTextArea getTextArquivo(){
		return tfArquivo;
	}
	
	public void setMsg(String msg){
		tfArvore.append(msg);
	}
	
	public void lookFeel() {
		  try {
			  for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				  if ("Nimbus".equals(info.getName())) {
					  UIManager.setLookAndFeel(info.getClassName());
				  }
			  }
		  }catch (Exception e) {
		   JOptionPane.showMessageDialog(null,
		     "Nao foi possivel executar o nimbus");
		  }
	}
	
	public void setVazioConsoleMsg(){
		tfConsole.setText("");
		tfArvore.setText("");
	}
	
	public void setConsole(String msg){
		tfConsole.append(msg);
	}
	
	public void setFile(File file){
		this.file = file;
	}
	
	
}
