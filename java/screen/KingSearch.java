package screen;

import button.AestheticButton;
import editstring.*;
import frame.KingGui;
import models.HistoricalFigure;
import models.King;

import com.google.gson.Gson;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class KingSearch extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhpThngTin;
	private JTable table;

	private DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KingSearch frame = new KingSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KingSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		setAutoRequestFocus(false);
		setBackground(new Color(240, 240, 240));
		getContentPane().setBackground(Color.WHITE);
		setSize(new Dimension(929, 520));
		setResizable(true);
		setPreferredSize(new Dimension(21, 11));
		setTitle("HISTORICAL APPLICATION\r\n");
		getContentPane().setLayout(null);

		AestheticButton btnNewButton_4 = new AestheticButton("NHÂN VẬT LỊCH SỬ");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiguresSearch nv = new FiguresSearch();
				dispose();
				nv.show();
			}
		});
		btnNewButton_4.setFont(new Font("Playfair Display", Font.BOLD, 12));
		btnNewButton_4.setBounds(122, 79, 212, 46);
		btnNewButton_4.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
		btnNewButton_4.setBackground(Color.WHITE);
		getContentPane().add(btnNewButton_4);


		AestheticButton btnNewButton = new AestheticButton("ĐỊA DANH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiteSearch dd = new SiteSearch();
				dispose();
				dd.show();
				//dispose();
			}
		});
		btnNewButton.setFont(new Font("Playfair Display", Font.BOLD, 12));
		btnNewButton.setBounds(122, 135, 212, 46);
		getContentPane().add(btnNewButton);

		AestheticButton btnNewButton_1 = new AestheticButton("LỄ HỘI VĂN HÓA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FesSearch lh = new FesSearch();
				dispose();
				lh.show();
				//dispose();
			}
		});
		btnNewButton_1.setBounds(122, 191, 212, 46);
		btnNewButton_1.setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_1);

		AestheticButton btnNewButton_5 = new AestheticButton("THOÁT");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBounds(122, 415, 212, 46);
		btnNewButton_5 .setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_5);

		AestheticButton btnNewButton_6 = new AestheticButton("VUA\r\n");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KingSearch king = new KingSearch();
				dispose();
				king.show();
				//dispose();
			}
		});
		btnNewButton_6.setBounds(122, 247, 212, 46);
		btnNewButton_6.setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_6);

		AestheticButton btnNewButton_3 = new AestheticButton("TRANG CHỦ\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen ab = new HomeScreen();
				dispose();
				ab.show();
				//dispose();
			}
		});
		btnNewButton_3.setBounds(122, 23, 212, 46);
		btnNewButton_3.setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_3);

		AestheticButton btnNewButton_7 = new AestheticButton("TRIỀU ĐẠI\r\n");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PeriodsSearch td = new PeriodsSearch();
				dispose();
				td.show();
				//dispose();
			}
		});
		btnNewButton_7.setBounds(122, 303, 212, 46);
		btnNewButton_7.setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_7);

		AestheticButton btnNewButton_8 = new AestheticButton("SỰ KIỆN\r\n");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WarSeach sk = new WarSeach();
				dispose();
				sk.show();
				//dispose();
			}
		});
		btnNewButton_8.setBounds(122, 359, 212, 46);
		btnNewButton_8.setFont(new Font("Playfair Display", Font.BOLD, 12));
		getContentPane().add(btnNewButton_8);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\giaoan.lik-trong-dong.png"));
		lblNewLabel_1.setBounds(-34, 0, 525, 490);
		getContentPane().add(lblNewLabel_1);

		txtNhpThngTin = new JTextField();
		txtNhpThngTin.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtNhpThngTin.setSize(314, 27);
		txtNhpThngTin.setLocation(534, 42);
		txtNhpThngTin.setBorder(new CompoundBorder(new LineBorder(new Color(128, 128, 128), 2), new EmptyBorder(5, 5, 5, 5)));
		getContentPane().add(txtNhpThngTin);
		File folder = new File("src\\main\\resources\\Json\\Kings");
		File[] fileList = folder.listFiles();

		Font font = new Font("Serif", Font.PLAIN, 18);


		Gson gson = new Gson();
		ArrayList<King> kingList = new ArrayList<>();
		for(File file : fileList){
			try{
				String content = new String(Files.readAllBytes(file.toPath()));
				if(content == null) continue;
				else{
					King king = gson.fromJson(content, King.class);
					if (king == null){
						continue;
					}
					kingList.add(king);
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}

		ArrayList<String> suggestionList = new ArrayList<>();
		for(King king : kingList){
			suggestionList.add(king.getName());
		}

		StringSorterIgnoreCase strSort = new StringSorterIgnoreCase();
		strSort.sortAlphabeticallyIgnoreCase(suggestionList);

		tableModel = new DefaultTableModel(new Object[]{"Index", "Name"},0);

		for(int i = 0; i < suggestionList.size(); i++){
			String name = suggestionList.get(i);
			tableModel.addRow(new Object[]{i+1, name});
		}


		txtNhpThngTin.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				String text = txtNhpThngTin.getText().toLowerCase();
				tableModel.setRowCount(0);
				for (int i = 0; i < suggestionList.size(); i++) {
					String suggestion = suggestionList.get(i);
					if (suggestion.toLowerCase().contains(text)) {
						tableModel.addRow(new Object[]{i + 1, suggestion});
					}
				}
			}
		});

		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		Font fontSuggest = new Font("Serif", Font.PLAIN, 16);
		table.setFont(fontSuggest);
		table.setForeground(new Color(0,0,153));
		table.setBackground(new Color(255,229,204));

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 1){
					int rowIndex = table.getSelectedRow();
					String selectedText = (String) table.getValueAt(rowIndex, 1);
					for (King king : kingList) {
						if(king.getName() == null) continue;
						else if (king.getName().equalsIgnoreCase(selectedText)) {
							dispose();
							KingGui kingGui = new KingGui(king);
							kingGui.setVisible(true);
						}
					}
				}
			}
		});



		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(370);

		scrollPane.setBounds(491, 108, 425, 382);
		contentPane.add(scrollPane);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\giphy (2).gif"));
		lblNewLabel_2.setBounds(491, 0, 480, 109);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("src\\main\\resources\\Pictures\\giphy.jpg"));
		lblNewLabel.setBounds(0, 0, 491, 500);
		contentPane.add(lblNewLabel);


	}
}
