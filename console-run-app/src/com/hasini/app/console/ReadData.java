package com.hasini.app.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadData {

    Scanner scan = new Scanner(System.in);

    protected int alignment_type(){
        int type = 0;
        InputMismatchException q;
        do {
            try {
                q=null;
                System.out.println("Enter 1 for global alignment or Enter 2 for local alignment");
                System.out.print("Select the alignment method : ");
                type = scan.nextInt();
            }catch (InputMismatchException e){
                q = e;
            }
            scan.nextLine();
            if (q != null){
                System.out.println("Input is not valid try again");
            }
            else if((type != 1)&&(type != 2)){
                System.out.println("Input is not valid try again");
            }
        }while (type != 1 && type != 2);
        return type;
    }

    protected char[] getSeq1_char(){
        char[] seq1_char;
        String seq1_str;
        do {
            System.out.print("Enter the first sequence : ");
            seq1_str = scan.next();
            seq1_char = seq1_str.toCharArray();
            if(check_seq(seq1_char))
                System.out.println("The sequence is not valid enter again");
        }while(check_seq(seq1_char));
        return seq1_char;
    }

    protected char[] getSeq2_char() {
        char[] seq2_char;
        String seq2_str;
        do {
            System.out.print("Enter the second sequence : ");
            seq2_str = scan.next();
            seq2_char = seq2_str.toCharArray();
            if(check_seq(seq2_char))
                System.out.println("The sequence is not valid enter again");
        }while(check_seq(seq2_char));
        return seq2_char;
    }

    protected boolean check_seq(char[] elements){
        boolean bit = false;
        for (char element : elements) {
            if ((element != 'A') && (element != 'T') && (element != 'G') && (element != 'C')
                    && (element != 'a') && (element != 't') && (element != 'g') && (element != 'c')) {
                bit = false;
                break;
            } else
                bit = true;
        }
        return !bit;
    }

    protected double match() {
        double m_val = 0;
        InputMismatchException q;
        do {
            try {
                System.out.print("Enter match : ");
                m_val = scan.nextDouble();
                q=null;
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid input ");
                q = e;
            }
            scan.nextLine();
        } while (q != null);
        return m_val;
    }

    protected double miss_match(){
        double miss_val = 0;
        InputMismatchException q;
        do {
            try {
                System.out.print("Enter miss-match : ");
                miss_val = scan.nextDouble();
                q=null;
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid input ");
                q = e;
            }
            scan.nextLine();
        } while (q != null);
        return miss_val;
    }

    protected double penalty(){
        double p_val = 0;
        InputMismatchException q;
        do {
            try {
                System.out.print("Enter penalty : ");
                p_val = scan.nextDouble();
                q=null;
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid input ");
                q = e;
            }
            scan.nextLine();
        } while (q != null);
        return p_val;
    }

}
