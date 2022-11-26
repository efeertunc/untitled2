package UI;

import AppView.AppFrame;
import AppView.AppPanel;
import AppView.AppView;
import Controller.AuthorizeController;
import Design.Design;
import Main.EscapeFromKoc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AuthorizeView extends AppView implements Design {

    private JTextField loginUsername;
    private JPasswordField loginPasswordField;
    private JButton loginButton;

    private JTextField newUsername;
    private JTextField userHint;
    private JPasswordField newPassword;
    private JPasswordField confirmPass;
    private JButton createAccountButton;

    private AuthorizeController authorizeController;


    public AuthorizeView() {
        super(new AppFrame(new JFrame()), new AppPanel(new JPanel()));
        authorizeController = new AuthorizeController(this, EscapeFromKoc.getInstance());
        initialize();
        design();
    }


    private void initialize() {

        loginUsername = new JTextField();
        loginPasswordField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });


        newUsername = new JTextField();
        userHint = new JTextField();
        newPassword = new JPasswordField();
        confirmPass = new JPasswordField();
        createAccountButton = new JButton("Create Account");
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAccount();
            }
        });

    }


    private void login() {
        System.out.println(loginUsername.getText().toString() + loginPasswordField.getText());
        authorizeController.loginClick(loginUsername.getText(), loginPasswordField.getText());

        //EscapeFromKoc.getInstance().changeView(this, (AppView) new MainMenuView());
    }


    private void createAccount() {
        System.out.println(newUsername.getText() + newPassword.getText() + userHint.getText());
        authorizeController.registerClick(newUsername.getText(), newPassword.getText(), userHint.getText());


    }


    // UI Design
    @Override
    public void design() {

        JLabel header = new JLabel("ESCAPE FROM KOC");

        this.getAppFrame().getFrame().setTitle("Welcome to EscapeFromKoc Game");
        this.getAppFrame().getFrame().setBounds(100, 100, 450, 382);
        this.getAppFrame().getFrame().setLocationRelativeTo(null);


        this.getAppFrame().getFrame().add(header);
        header.setBounds(66, 20, 314, 61);
        header.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        header.setHorizontalAlignment(SwingConstants.CENTER);


        this.getAppFrame().getFrame().add(loginUsername);
        loginUsername.setColumns(10);
        loginUsername.setBounds(66, 93, 130, 26);
        loginUsername.setText("Type Username");
        loginUsername.setForeground(new Color(142, 144, 145));
        loginUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (loginUsername.getText().equals("Type Username")) {
                    loginUsername.setText("");
                    loginUsername.setForeground(new Color(0, 0, 0));
                }
            }
        });
        loginUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (loginUsername.getText().equals("")) {
                    loginUsername.setText("Type Username");
                    loginUsername.setForeground(new Color(142, 144, 145));
                }
            }
        });

        this.getAppFrame().getFrame().add(loginPasswordField);
        loginPasswordField.setBounds(250, 93, 130, 26);
        char passwordChar = loginPasswordField.getEchoChar();
        loginPasswordField.setEchoChar((char) 0);
        loginPasswordField.setText("Enter password");
        loginPasswordField.setForeground(new Color(142, 144, 145));
        loginPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (loginPasswordField.getText().equals("Enter password")) {
                    loginPasswordField.setText("");
                    loginPasswordField.setEchoChar(passwordChar);
                    loginPasswordField.setForeground(new Color(0, 0, 0));
                }
            }
        });
        loginPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (loginPasswordField.getText().equals("")) {
                    loginPasswordField.setEchoChar((char) 0);
                    loginPasswordField.setText("Enter password");
                    loginPasswordField.setForeground(new Color(142, 144, 145));

                }
            }
        });


        this.getAppFrame().getFrame().add(loginButton);
        loginButton.setBounds(185, 131, 79, 29);


        JLabel orLabel = new JLabel("-or-");
        this.getAppFrame().getFrame().add(orLabel);
        orLabel.setHorizontalAlignment(SwingConstants.CENTER);
        orLabel.setBounds(6, 173, 438, 16);


        this.getAppFrame().getFrame().add(newUsername);
        newUsername.setBounds(66, 201, 130, 26);
        newUsername.setColumns(10);
        newUsername.setText("Type Username");
        newUsername.setForeground(new Color(142, 144, 145));
        newUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (newUsername.getText().equals("Type Username")) {
                    newUsername.setText("");
                    newUsername.setForeground(new Color(0, 0, 0));
                }
            }
        });
        newUsername.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (newUsername.getText().equals("")) {
                    newUsername.setText("Type Username");
                    newUsername.setForeground(new Color(142, 144, 145));
                }
            }
        });

        this.getAppFrame().getFrame().add(userHint);
        userHint.setColumns(10);
        userHint.setBounds(66, 239, 130, 26);
        userHint.setText("Type Hint");
        userHint.setForeground(new Color(142, 144, 145));
        userHint.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userHint.getText().equals("Type Hint")) {
                    userHint.setText("");
                    userHint.setForeground(new Color(0, 0, 0));
                }
            }
        });
        userHint.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (userHint.getText().equals("")) {
                    userHint.setText("Type Hint");
                    userHint.setForeground(new Color(142, 144, 145));
                }
            }
        });

        this.getAppFrame().getFrame().add(newPassword);
        newPassword.setBounds(250, 201, 130, 26);
        newPassword.setEchoChar((char) 0);
        newPassword.setText("Enter password");
        newPassword.setForeground(new Color(142, 144, 145));
        newPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (newPassword.getText().equals("Enter password")) {
                    newPassword.setText("");
                    newPassword.setEchoChar(passwordChar);
                    newPassword.setForeground(new Color(0, 0, 0));
                }
            }
        });
        newPassword.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (newPassword.getText().equals("")) {
                    newPassword.setEchoChar((char) 0);
                    newPassword.setText("Enter password");
                    newPassword.setForeground(new Color(142, 144, 145));

                }
            }
        });

        this.getAppFrame().getFrame().add(confirmPass);
        confirmPass.setBounds(250, 239, 130, 26);
        confirmPass.setEchoChar((char) 0);
        confirmPass.setText("Confirm password");
        confirmPass.setForeground(new Color(142, 144, 145));
        confirmPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (confirmPass.getText().equals("Confirm password")) {
                    confirmPass.setText("");
                    confirmPass.setEchoChar(passwordChar);
                    confirmPass.setForeground(new Color(0, 0, 0));
                }
            }
        });
        confirmPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (confirmPass.getText().equals("")) {
                    confirmPass.setEchoChar((char) 0);
                    confirmPass.setText("Confirm password");
                    confirmPass.setForeground(new Color(142, 144, 145));

                }
            }
        });


        this.getAppFrame().getFrame().add(createAccountButton);
        createAccountButton.setBounds(153, 277, 159, 29);


    }
}
