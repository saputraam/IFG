String calcScript = """

FIX(
${cscParams(operation.grid.pov)},
"Jan":"Dec",
"Direct Input"
);

/*Project Feasibility Study*/
   	"5190500000000" 
   	(
      IF ("Project Feasibility Study (Nominal Gross)" -> "Project Feasibility Study"  != #MISSING)
        "5190500000000" -> "Project Feasibility Study"   = "Project Feasibility Study (Nominal Gross)" -> "Project Feasibility Study" ;
      ELSEIF ("Project Feasibility Study - Average Project Value (Rp)" -> "Project Feasibility Study"  != #MISSING)
         "5190500000000" -> "Project Feasibility Study"  = "Project Feasibility Study - Average Project Value (Rp)" -> "Project Feasibility Study" ;
      ENDIF;
    )

    "Project Feasibility Study  (KD1)"
    ("Project Feasibility Study  (KD1)" -> "Project Feasibility Study" = "Project Feasibility Study - Average Project Value (Rp)"  -> "Project Feasibility Study" 
                                                                        -"Project Feasibility Study - Sub-Consultant Cost (Rp)" -> "Project Feasibility Study";)

    "Project Feasibility Study - Consultant Cost as % to Total Project Value"
    ( "Project Feasibility Study - Consultant Cost as % to Total Project Value" -> "Project Feasibility Study" = @ROUND("Project Feasibility Study - Sub-Consultant Cost (Rp)" -> "Project Feasibility Study"
                                                                                                               / "Project Feasibility Study - Average Project Value (Rp)" -> "Project Feasibility Study",2);)

/*Project RJPP*/

	"5190500000000" 
   	(
      IF ("Project RJPP  (Nominal Gross)" -> "Project RJPP"  != #MISSING)
        "5190500000000" -> "Project RJPP"  = "Project RJPP  (Nominal Gross)" -> "Project RJPP" ;
      ELSEIF ("Project RJPP - Average Project Value (Rp)" -> "Project RJPP"  != #MISSING)
         "5190500000000" -> "Project RJPP"  = "Project RJPP - Average Project Value (Rp)" -> "Project RJPP";
      ENDIF;
    )

    "Project RJPP (KD1)"
    ("Project RJPP (KD1)" -> "Project RJPP" = "Project RJPP - Average Project Value (Rp)" -> "Project RJPP"
                                            - "Project RJPP - Sub-Consultant Cost (Rp)" -> "Project RJPP";)

    "Project RJPP - Consultant Cost as % to Total Project Value"
    ("Project RJPP - Consultant Cost as % to Total Project Value" = @ROUND("Project RJPP - Sub-Consultant Cost (Rp)" -> "Project RJPP"
                                                                  /  "Project RJPP - Average Project Value (Rp)" -> "Project RJPP" ,2);)

/*Project Merger & Aquistion*/

    "5190500000000" 
        (
        IF ("Project Merger & Aquistion  (Nominal Gross)" -> "Project Merger & Aquistion"  != #MISSING)
            "5190500000000" -> "Project Merger & Aquistion"  = "Project Merger & Aquistion  (Nominal Gross)" -> "Project Merger & Aquistion" ;
        ELSEIF ("Project Merger & Aquistion - Average Project Value (Rp)" -> "Project Merger & Aquistion"  != #MISSING)
            "5190500000000" -> "Project Merger & Aquistion"  = "Project Merger & Aquistion - Average Project Value (Rp)" -> "Project Merger & Aquistion";
        ENDIF;
        )

        "Project Merger & Aquistion (KD1)"
        ("Project Merger & Aquistion (KD1)" -> "Project Merger & Aquistion" = "Project Merger & Aquistion - Average Project Value (Rp)" -> "Project Merger & Aquistion"
                                                - "Project Merger & Aquistion - Sub-Consultant Cost (Rp)" -> "Project Merger & Aquistion";)

        "Project Merger & Aquistion - Consultant Cost as % to Total Project Value"
        ("Project Merger & Aquistion - Consultant Cost as % to Total Project Value" = @ROUND("Project Merger & Aquistion - Sub-Consultant Cost (Rp)" -> "Project Merger & Aquistion"
                                                                    /  "Project Merger & Aquistion - Average Project Value (Rp)" -> "Project Merger & Aquistion" ,2);)

/*Project Corporate Strategy / Restructuring*/

    "5190500000000" 
        (
        IF ("Project Corporate Strategy / Restr (Nominal Gross)" -> "Project Corporate Strategy / Restructuring"  != #MISSING)
            "5190500000000" -> "Project Corporate Strategy / Restructuring"  = "Project Corporate Strategy / Restr (Nominal Gross)" -> "Project Corporate Strategy / Restructuring" ;
        ELSEIF ("Project Corporate Strategy / Restr - Average Project Value (Rp)" -> "Project Corporate Strategy / Restructuring"  != #MISSING)
            "5190500000000" -> "Project Corporate Strategy / Restructuring"  = "Project Corporate Strategy / Restr - Average Project Value (Rp)" -> "Project Corporate Strategy / Restructuring";
        ENDIF;
        )

         "Project Corporate Strategy / Restr (KD1)"
        ("Project Corporate Strategy / Restr (KD1)" -> "Project Corporate Strategy / Restructuring" = "Project Corporate Strategy / Restr - Average Project Value (Rp)" -> "Project Corporate Strategy / Restructuring"
                                                                                                    - "Project Corporate Strategy / Restr - Sub-Consultant Cost (Rp)" -> "Project Corporate Strategy / Restructuring";)

        "Project Corporate Strategy / Restr - Consultant Cost as % to Total Project Value"
        ("Project Corporate Strategy / Restr - Consultant Cost as % to Total Project Value" = @ROUND("Project Corporate Strategy / Restr - Sub-Consultant Cost (Rp)" -> "Project Corporate Strategy / Restructuring"
                                                                       / "Project Corporate Strategy / Restr - Average Project Value (Rp)" -> "Project Corporate Strategy / Restructuring" ,2);)

/*Project Divestment

    "5190500000000" 
        (
        IF ("Project Divestment  (Nominal Gross)" -> "Project Divestment"  != #MISSING)
            "5190500000000" -> "Project Divestment"  = "Project Divestment  (Nominal Gross)" -> "Project Divestment" ;
        ELSEIF ("Project Divestment - Average Project Value (Rp)" -> "Project Divestment"  != #MISSING)
            "5190500000000" -> "Project Divestment"  = "Project Divestment - Average Project Value (Rp)" -> "Project Divestment";
        ENDIF;
        )

        "Project Divestment (KD1)"
        ("Project Divestment (KD1)" -> "Project Divestment" = "Project Divestment - Average Project Value (Rp)" -> "Project Divestment"
                                                - "Project Divestment - Sub-Consultant Cost (Rp)" -> "Project Divestment";)

        "Project Divestment - Consultant Cost as % to Total Project Value"
        ("Project Divestment - Consultant Cost as % to Total Project Value" = @ROUND("Project Divestment - Sub-Consultant Cost (Rp)" -> "Project Divestment"
                                                                    /  "Project Divestment - Average Project Value (Rp)" -> "Project Divestment" ,2);)
*/
/*Project dengan Non Anper IFG - Subrogasi*/

    "5190500000000" 
        (
        IF ("Project dengan Non Anper IFG - Subrogasi (Nominal Gross)" -> "Project dengan Non Anper IFG - Subrogasi"  != #MISSING)
            "5190500000000" -> "Project dengan Non Anper IFG - Subrogasi"  = "Project dengan Non Anper IFG - Subrogasi (Nominal Gross)" -> "Project dengan Non Anper IFG - Subrogasi" ;
        ELSEIF ("Project dengan Non Anper IFG - Subrogasi  - Average Project Value (Rp)" -> "Project dengan Non Anper IFG - Subrogasi"  != #MISSING)
            "5190500000000" -> "Project dengan Non Anper IFG - Subrogasi"  = "Project dengan Non Anper IFG - Subrogasi  - Average Project Value (Rp)" -> "Project dengan Non Anper IFG - Subrogasi";
        ENDIF;
        )

        "Project dengan Non Anper IFG - Subrogasi (KD1)"
        ("Project dengan Non Anper IFG - Subrogasi (KD1)" -> "Project dengan Non Anper IFG - Subrogasi" = "Project dengan Non Anper IFG - Subrogasi  - Average Project Value (Rp)" -> "Project dengan Non Anper IFG - Subrogasi"
                                                - "Project dengan Non Anper IFG - Subrogasi - Sub-Consultant Cost (Rp)" -> "Project dengan Non Anper IFG - Subrogasi";)

        "Project dengan Non Anper IFG - Subrogasi - Consultant Cost as % to Total Project Value"
        ("Project dengan Non Anper IFG - Subrogasi - Consultant Cost as % to Total Project Value" = @ROUND("Project dengan Non Anper IFG - Subrogasi - Sub-Consultant Cost (Rp)" -> "Project dengan Non Anper IFG - Subrogasi"
                                                                    /  "Project dengan Non Anper IFG - Subrogasi  - Average Project Value (Rp)" -> "Project dengan Non Anper IFG - Subrogasi" ,2);)

/*Project dengan Anper IFG - Subrogasi*/

    "5190500000000" 
        (
        IF ("Project dengan Anper IFG - Subrogasi  (Nominal Gross)" -> "Project dengan Anper IFG - Subrogasi"  != #MISSING)
            "5190500000000" -> "Project dengan Anper IFG - Subrogasi"  = "Project dengan Anper IFG - Subrogasi  (Nominal Gross)" -> "Project dengan Anper IFG - Subrogasi" ;
        ELSEIF ("Project dengan Anper IFG - Subrogasi - Average Project Value (Rp)" -> "Project dengan Anper IFG - Subrogasi"  != #MISSING)
            "5190500000000" -> "Project dengan Anper IFG - Subrogasi"  = "Project dengan Anper IFG - Subrogasi - Average Project Value (Rp)" -> "Project dengan Anper IFG - Subrogasi";
        ENDIF;
        )

        "Project dengan Anper IFG - Subrogasi (KD1)"
        ("Project dengan Anper IFG - Subrogasi (KD1)" -> "Project dengan Anper IFG - Subrogasi" = "Project dengan Anper IFG - Subrogasi - Average Project Value (Rp)" -> "Project dengan Anper IFG - Subrogasi"
                                                - "Project dengan Anper IFG - Subrogasi - Sub-Consultant Cost (Rp)" -> "Project dengan Anper IFG - Subrogasi";)

        "Project dengan Anper IFG - Subrogasi - Consultant Cost as % to Total Project Value"
        ("Project dengan Anper IFG - Subrogasi - Consultant Cost as % to Total Project Value" = @ROUND("Project dengan Anper IFG - Subrogasi - Sub-Consultant Cost (Rp)" -> "Project dengan Anper IFG - Subrogasi"
                                                                    /  "Project dengan Anper IFG - Subrogasi - Average Project Value (Rp)" -> "Project dengan Anper IFG - Subrogasi" ,2);)

/*Project Lainnya*/

    "5190500000000" 
        (
        IF ("Project Lainnya  (Nominal Gross)" -> "Project Lainnya"  != #MISSING)
            "5190500000000" -> "Project Lainnya"  = "Project Lainnya  (Nominal Gross)" -> "Project Lainnya" ;
        ELSEIF ("Project Lainnya - Average Project Value (Rp)" -> "Project Lainnya"  != #MISSING)
            "5190500000000" -> "Project Lainnya"  = "Project Lainnya - Average Project Value (Rp)" -> "Project Lainnya";
        ENDIF;
        )

        "Project Lainnya (KD1)"
        ("Project Lainnya (KD1)" -> "Project Lainnya" = "Project Lainnya - Average Project Value (Rp)" -> "Project Lainnya"
                                                - "Project Lainnya - Sub-Consultant Cost (Rp)" -> "Project Lainnya";)

        "Project Lainnya - Consultant Cost as % to Total Project Value"
        ("Project Lainnya - Consultant Cost as % to Total Project Value" = @ROUND("Project Lainnya - Sub-Consultant Cost (Rp)" -> "Project Lainnya"
                                                                  /  "Project Lainnya - Average Project Value (Rp)" -> "Project Lainnya" ,2);)

"Pendapatan jasa penasehat keuangan (net)"
("Pendapatan Jasa Penasehat Keuangan" -> "Pendapatan jasa penasehat keuangan (net)" = 100;) 

/*Sum Account and KD

"Pendapatan jasa penasehat keuangan (net)"
("Pendapatan jasa penasehat keuangan (net)" -> "Pendapatan Jasa Penasehat Keuangan" = "5190500000000" -> "Project Feasibility Study"
                                                                                    + "5190500000000" -> "Project RJPP"
                                                                                    + "5190500000000" -> "Project Merger & Aquistion"
                                                                                    + "5190500000000" -> "Project Corporate Strategy / Restructuring"; )

"Pendapatan jasa penasehat keuangan (gross)"
("Pendapatan jasa penasehat keuangan (gross)" -> "Pendapatan Jasa Penasehat Keuangan" =   "Project Feasibility Study  (KD1)" -> "Project Feasibility Study" 
                                                                                        + "Project RJPP (KD1)" -> "Project RJPP"
                                                                                        + "Project Merger & Aquistion (KD1)" -> "Project Merger & Aquistion"
                                                                                        + "Project Corporate Strategy / Restr (KD1)" -> "Project Corporate Strategy / Restructuring";)
*/
ENDFIX;

"""
println("The following calc script was executed by $operation.user.fullName: \n $calcScript")
return calcScript.toString()