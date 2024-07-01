import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Look and Feel
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        // Defining main window
        JFrame mainwindow = new JFrame("SEVEN CHC Setup Assistant 2.0");
        mainwindow.setSize(500, 250);
        mainwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainwindow.setResizable(false);

        // Adding elements
        JPanel southpanel = new JPanel();
        JPanel centpanel = new JPanel(new GridLayout(5, 2));
        JLabel status = new JLabel("Welcome to SEVEN CHC Setup Assistant");
        southpanel.setBackground(Color.white);
        southpanel.add(status);

        JLabel part1 = new JLabel("Part 1: Basic Software");
        JButton partb1 = new JButton("Install now");
        partb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("Installing Part 1...");
                partb1.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);
                        String part1exe = "src\\Part1.exe";
                        ProcessBuilder part1process = new ProcessBuilder("cmd.exe", "/c", "start", part1exe);
                        Process part1proc = part1process.start();
                        int exitCode = part1proc.waitFor();
                        System.out.println("Part 1 completed with exit code: " + exitCode);
                        String part12exe="src\\BasicSoftware.bat";
                        ProcessBuilder part12process = new ProcessBuilder("cmd.exe", "/c", "start", part12exe);
                        Process part12proc= part12process.start();
                        int exitCode2 = part12proc.waitFor();
                        System.out.println("Part 1.2 completed with exit code:"+ exitCode2);
                        status.setText("Part 1 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        JLabel part2 = new JLabel("Part 2: Messaging Tools");
        JButton partb2 = new JButton("Install now");
        partb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("Installing Part 2...");
                partb2.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);
                        String part2exe = "src\\DMandSocialMedia.bat";
                        ProcessBuilder part2process = new ProcessBuilder("cmd.exe", "/c", "start", part2exe);
                        Process part2proc = part2process.start();
                        int exitCode = part2proc.waitFor();
                        System.out.println("Part 2 completed with exit code: " + exitCode);
                        status.setText("Part 2 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        JLabel part3 = new JLabel("Part 3: Developer Tools");
        JButton partb3 = new JButton("Install now");
        partb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("Installing Part 3...");
                partb3.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);
                        String part3exe = "src\\ProgrammingTools.bat";
                        ProcessBuilder part3process = new ProcessBuilder("cmd.exe", "/c", "start", part3exe);
                        Process part3proc = part3process.start();
                        int exitCode = part3proc.waitFor();
                        System.out.println("Part 3 completed with exit code: " + exitCode);
                        status.setText("Part 3 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });

        JLabel part4 = new JLabel("Part 4: Data Analytics Tools");
        JButton partb4 = new JButton("Install now");
        partb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                status.setText("Installing Part 4...");
                partb4.setEnabled(false);
                new Thread(() -> {
                    try {
                        Thread.sleep(5000);
                        String part1exe = "src\\datatools.bat";
                        ProcessBuilder part4process = new ProcessBuilder("cmd.exe", "/c", "start", part1exe);
                        Process part4proc = part4process.start();
                        int exitCode = part4proc.waitFor();
                        System.out.println("Part 4 completed with exit code: " + exitCode);
                        status.setText("Part 4 completed");
                    } catch (IOException | InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();

            }
        });
        JLabel quickinstall = new JLabel("Quick install Office, PDF, Browser");
        JButton quickintlalb = new JButton("Install now");
        quickintlalb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO: implement commands
            }
        });
        centpanel.add(part1);
        centpanel.add(partb1);
        centpanel.add(part2);
        centpanel.add(partb2);
        centpanel.add(part3);
        centpanel.add(partb3);
        centpanel.add(part4);
        centpanel.add(partb4);
        centpanel.add(quickinstall);
        centpanel.add(quickintlalb);

        // Menubar
        JMenuBar menu1 = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem refresh = new JMenuItem("Refresh agent");
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                partb1.setEnabled(true);
                partb2.setEnabled(true);
                partb3.setEnabled(true);
                partb4.setEnabled(true);
                quickintlalb.setEnabled(true);
                status.setText("Agent refreshed");
            }
        });
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "SEVEN CHC Setup Assistant 2.0\n" +
                        "Created by Seven IT Department\nCopyright 2024-2025", "About Setup Assistant", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        help.add(about);
        file.add(refresh);
        file.add(exit);
        menu1.add(file);
        menu1.add(help);

        // Setting up elements
        mainwindow.getContentPane().add(BorderLayout.SOUTH, southpanel);
        mainwindow.getContentPane().add(BorderLayout.NORTH, menu1);
        mainwindow.getContentPane().add(BorderLayout.CENTER, centpanel);

        // Making window visible
        mainwindow.setVisible(true);
    }
}
