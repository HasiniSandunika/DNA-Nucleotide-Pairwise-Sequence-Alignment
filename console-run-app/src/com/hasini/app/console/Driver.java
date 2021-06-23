package com.hasini.app.console;

public class Driver {

    ReadData read = new ReadData();
    private int type;
    private char[] seq1;
    private char[] seq2;
    private double match;
    private double miss_match;
    private double penalty;

    public Driver() {
        this.type = read.alignment_type();
        this.seq1 = read.getSeq1_char();
        this.seq2 = read.getSeq2_char();
        this.match = read.match();
        this.miss_match = read.miss_match();
        this.penalty = read.penalty();
    }

    protected void procedure() {
        if (type == 1) { /////////global alignment
            GlobalAlignment glo_align = new GlobalAlignment();
            glo_align.algorithm_global_matrix(seq1, seq2, match, miss_match, penalty);
            glo_align.print_global_matrix(seq1, seq2);
            glo_align.sequence_global(seq1, seq2);
        }
        else { /////////local alignment
            LocalAlignment loc_align = new LocalAlignment();
            loc_align.algorithm_local_matrix(seq1, seq2, match, miss_match, penalty);
            loc_align.print_local_matrix(seq1, seq2);
            loc_align.sequence_local(seq1, seq2);
        }
    }

}