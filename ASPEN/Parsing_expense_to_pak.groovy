    import com.oracle.epm.api.metadata.Member
    import oracle.epm.api.grid.DataGrid$DataCell

    def grid = operation.grid
    def counter = 1
    def counter2 = 1
    def counter3 = 1
    def counter4 = 1
    def counter5 = 1
    def counter6 = 1
    def counter7 = 1
    def counter8 = 1
    def counter9 = 1
    def counter10 = 1
    def counter11 = 1
    def counter12 = 1
    def combination = ""
    def combination2 = ""
    def combination3 = ""
    def combination4 = ""
    def combination5 = ""
    def combination6 = ""
    def combination7 = ""
    def combination8 = ""
    def combination9 = ""
    def combination10 = ""
    def combination11 = ""
    def combination12 = ""

// LOOPING FOR PER MONTH

        grid.dataCellIterator('Jan').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination += """
                        "COA"
                        (  "COA" -> "Assumptions" -> "${counter}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter}" -> "Jan"   =  ${amount} ;
                        )
                        """
            counter += 1
        } 
    
        }

            grid.dataCellIterator('Feb').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination2 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter2}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter2}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter2}" -> "Feb"  =  ${amount} ;
                        )
                        """   
            counter2 += 1
        } 
    
        }

         grid.dataCellIterator('Mar').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination3 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter3}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter3}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter3}" -> "Mar"  =  ${amount} ;
                        )
                        """   
            counter3 += 1
        } 
    
        }

         grid.dataCellIterator('Apr').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination4 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter4}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter4}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter4}" -> "Apr"  =  ${amount} ;
                        )
                        """   
            counter4 += 1
        } 
    
        }

         grid.dataCellIterator('May').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination5 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter5}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter5}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter5}" -> "May"  =  ${amount} ;
                        )
                        """   
            counter5 += 1
        } 
        }

         grid.dataCellIterator('Jun').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination6 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter6}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter6}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter6}" -> "Jun"  =  ${amount} ;
                        )
                        """   
            counter6 += 1
        } 
        }

         grid.dataCellIterator('Jul').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination7 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter7}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter7}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter7}" -> "Jul"  =  ${amount} ;
                        )
                        """   
            counter7 += 1
        } 
        }

         grid.dataCellIterator('Aug').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination8 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter8}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter8}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter8}" -> "Aug"  =  ${amount} ;
                        )
                        """   
            counter8 += 1
        } 
        }

        grid.dataCellIterator('Sep').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination9 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter9}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter9}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter9}" -> "Sep"  =  ${amount} ;
                        )
                        """   
            counter9 += 1
        } 
        }

        grid.dataCellIterator('Oct').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination10 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter10}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter10}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter10}" -> "Oct"  =  ${amount} ;
                        )
                        """   
            counter10 += 1
        } 
        }

         grid.dataCellIterator('Nov').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination11 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter11}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter11}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter11}" -> "Nov"  =  ${amount} ;
                        )
                        """   
            counter11 += 1
        } 
        }

        grid.dataCellIterator('Dec').each {cell2 ->
            // Ambil nilai sel
            def amount = new BigDecimal(cell2.data)

            def Proker   = cell2.memberNames[1]
            def coa      = cell2.memberNames[0]

            if (amount != 0 ) {
            
            combination12 += """
                         "COA"
                        (  "COA" -> "Assumptions" -> "${counter12}" = ${coa} ;
                        )
                        "Proker"
                        (  "Proker" -> "Assumptions" -> "${counter12}" = ${Proker} ;
                        )
                        "Rencana Realisasi per bulan"
                        (
                            "Rencana Realisasi per bulan"  -> "${counter12}" -> "Dec"  =  ${amount} ;
                        )
                        """   
            counter12 += 1
        } 
        }

        



    String calcScript = """


    FIX(
        ${cscParams(operation.grid.pov)},
        "Jan":"Dec", 
        @relative("Custom Row",0)
    );

    ${combination}
    ${combination2}
    ${combination3}
    ${combination4}
    ${combination5}
    ${combination6}
    ${combination7}
    ${combination8}
    ${combination9}
    ${combination10}
    ${combination11}
    ${combination12}
        
    ENDFIX;


    """

    println("The following calc script was executed by $operation.user.fullName: \n $calcScript")
    return calcScript.toString()

