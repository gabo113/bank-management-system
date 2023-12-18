package com.gabodev.bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;



public class SignupOne extends JFrame {

    SignupOne(){

        setLayout(null);

        Random ram = new Random();
        Long Random = Math.abs((ram.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APLICATION FORM NO. " + Random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(130, 20, 600,40);
        add(formno);

        JLabel perosnDetails = new JLabel("page 1: Personal Details. ");
        perosnDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        perosnDetails.setBounds(250, 80, 400,30);
        add(perosnDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100,30);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 200,25);
        add(nameTextField);

        JLabel lastName = new JLabel("Last Name: ");
        lastName.setFont(new Font("Raleway", Font.BOLD, 20));
        lastName.setBounds(100, 190, 200,30);
        add(lastName);

        JTextField lastNameTextField = new JTextField();
        lastNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        lastNameTextField.setBounds(300, 190, 200,25);
        add(lastNameTextField);

        JLabel dob = new JLabel("Day of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200,30);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 200, 30);
        dateChooser.setForeground(Color .RED);
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200,30);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(440, 290, 70, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200,30);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 200,25);
        add(emailTextField);

        JLabel civilStatus = new JLabel("Civil Status: ");
        civilStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        civilStatus.setBounds(100, 390, 200,30);
        add(civilStatus);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        JRadioButton single = new JRadioButton("Single");
        single.setBounds(440, 390, 100, 30);
        single.setBackground(Color.WHITE);
        add(single);

        ButtonGroup civilgroup = new ButtonGroup();
        civilgroup.add(married);
        civilgroup.add(single);


        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200,30);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 200,25);
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200,30);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 200,25);
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200,30);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 200,25);
        add(stateTextField);

        JLabel pinCode = new JLabel("Pin Code: ");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200,30);
        add(pinCode);

        JTextField pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 590, 200,25);
        add(pinCodeTextField);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 680, 80, 30);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(800, 800);
        setLocation(350, 10);
        setVisible(true);

    }
}
