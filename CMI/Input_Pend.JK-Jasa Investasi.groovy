String calcScript = """

FIX(
${cscParams(operation.grid.pov)},
"Jan":"Dec",
"Direct Input",
@ICHILDREN("Pendapatan kegiatan sekuritas - net"),
@ICHILDREN("Project dengan Anper IFG - Non Subrogasi"),
@ICHILDREN("Pendapatan Bagi Hasil Ultra Mikro - Platform"),
@ICHILDREN("Pendapatan Bagi Hasil Komersil"),
@ICHILDREN("Pendapatan Administrasi & Provisi Komersil"),
@ICHILDREN("Pendapatan Bagi Hasil PMVJP"),
@ICHILDREN("Pendapatan Administrasi & Provisi PMVJP"),
@ICHILDREN("Pendapatan Bunga Pinjaman"),
@ICHILDREN("Pendapatan Administrasi Bunga Pinjaman"),
@ICHILDREN("Penyertaan Saham - Gain"),
@ICHILDREN("Pendapatan Kupon OK"),
@ICHILDREN("Pendapatan Administrasi Asosiasi")

);
	/*Pendapatan kegiatan sekuritas - net*/
    
   	"Pendapatan kegiatan sekuritas - net" 
   	(
      IF ("Pendapatan Jasa Investasi (Nominal)" != #MISSING)
         "Pendapatan kegiatan sekuritas - net" = "Pendapatan Jasa Investasi (Nominal)";
      ELSEIF ("Pendapatan Jasa Investasi (KD1)" != #MISSING)
         "Pendapatan kegiatan sekuritas - net" = "Pendapatan Bagi Hasil Ultra Mikro- Executing (Key Driver)";
      ENDIF;
    )

    "Coupon Return - Exchangeable Bonds MKI" = null;

    /*Project dengan Anper IFG - Non Subrogasi*/

    "Project dengan Anper IFG - Non Subrogasi"      = "Nominal Gross (Rp)" - "Sub consultant cost (Rp) (Biaya Konsultan Pendukung)";
    "Project dengan Anper IFG - Non Subrogasi (KD)" =" % Tarif Rata-Rata (YoY)";

    /*Pendapatan Bagi Hasil Ultra Mikro - Platform*/
    
    "Pendapatan Bagi Hasil Ultra Mikro - Platform (KD2)" = "% Tarif Rata-Rata (YoY)";
    "Pendapatan Bagi Hasil Ultra Mikro - Platform (KD2)" = null;
    "Pendapatan Bagi Hasil Ultra Mikro - Platform (KD3)" = "Non-Performing Loans (%)";
    "Pendapatan Bagi Hasil Ultra Mikro - Platform (KD4)" = null;

    "Pendapatan Bagi Hasil Ultra Mikro - Platform" 
   	(
      IF ("Pendapatan Bagi Hasil Ultra Mikro - Platform (Nominal)" != #MISSING)
         "Pendapatan Bagi Hasil Ultra Mikro - Platform" = "Pendapatan Bagi Hasil Ultra Mikro - Platform (Nominal)";
      ELSEIF ("Pendapatan Bagi Hasil Ultra Mikro - Platform (KD1)" != #MISSING)
         "Pendapatan Bagi Hasil Ultra Mikro - Platform" = "Pendapatan Bagi Hasil Ultra Mikro - Platform (KD1)";
      ENDIF;
    )

    /*Pendapatan Bagi Hasil Komersil*/
    
    "Pendapatan Bagi Hasil Komersil (KD1)" = "% Tarif Rata-Rata (YoY)";
    "Pendapatan Bagi Hasil Komersil (KD2)" = null;
    "Pendapatan Bagi Hasil Komersil (KD3)" = "Non-Performing Loans (%)";
    "Pendapatan Bagi Hasil Komersil (KD4)" = "Jumlah Debitur";

    "Pendapatan Bagi Hasil Komersil" 
   	(
      IF ("Pendapatan Bagi Hasil Komersil (Nominal)" != #MISSING)
         "Pendapatan Bagi Hasil Ultra Mikro - Platform" = "Pendapatan Bagi Hasil Komersil (Nominal)";
      ELSEIF ("Pendapatan Bagi Hasil Komersil (KD1)" != #MISSING)
         "Pendapatan Bagi Hasil Ultra Mikro - Platform" = "Pendapatan Bagi Hasil Komersil (KD1)";
      ENDIF;
    )

    /*Pendapatan Administrasi & Provisi Komersil*/

    "Pendapatan Administrasi & Provisi Komersil" 
   	(
      IF ("Pendapatan Administrasi & Provisi Komersil (Nominal)" != #MISSING)
         "Pendapatan Administrasi & Provisi Komersil" = "Pendapatan Administrasi & Provisi Komersil (Nominal)";
      ELSEIF ("Pendapatan Administrasi & Provisi Komersil (KD1)" != #MISSING)
         "Pendapatan Administrasi & Provisi Komersil" = "Pendapatan Administrasi & Provisi Komersil (KD1)";
      ENDIF;
    )

    /*Pendapatan Bagi Hasil PMVJP*/

    "Pendapatan Bagi Hasil PMVJP (KD1)" = "% Tarif Rata-Rata (YoY)";
    "Pendapatan Bagi Hasil PMVJP (KD2)" = null;
    "Pendapatan Bagi Hasil PMVJP (KD3)" = "Non-Performing Loans (%)";
    "Pendapatan Bagi Hasil PMVJP (KD4)" = "Jumlah Debitur";

    "Pendapatan Bagi Hasil PMVJP" 
   	(
      IF ("Pendapatan Bagi Hasil PMVJP (Nominal)" != #MISSING)
         "Pendapatan Bagi Hasil PMVJP" = "Pendapatan Bagi Hasil PMVJP (Nominal)";
      ELSEIF ("Pendapatan Bagi Hasil PMVJP (KD1)" != #MISSING)
         "Pendapatan Bagi Hasil PMVJP" = "Pendapatan Bagi Hasil PMVJP (KD1)";
      ENDIF;
    )

    /*Pendapatan Administrasi & Provisi PMVJP*/

    "Pendapatan Administrasi & Provisi PMVJP" 
   	(
      IF ("Pendapatan Administrasi & Provisi PMVJP (Nominal)" != #MISSING)
         "Pendapatan Administrasi & Provisi PMVJP" = "Pendapatan Administrasi & Provisi PMVJP (Nominal)";
      ELSEIF ("Pendapatan Administrasi & Provisi PMVJP (KD1)" != #MISSING)
         "Pendapatan Administrasi & Provisi PMVJP" = "Pendapatan Administrasi & Provisi PMVJP (KD1)";
      ENDIF;
    )

    /*Pendapatan Bunga Pinjaman*/

    "Pendapatan Bunga Pinjaman (KD1)" = "% Tarif Rata-Rata (YoY)";
    "Pendapatan Bunga Pinjaman (KD2)" = null;
    "Pendapatan Bunga Pinjaman (KD3)" = "Non-Performing Loans (%)";
    "Pendapatan Bunga Pinjaman (KD4)" = null;

    "Pendapatan Bunga Pinjaman" 
   	(
      IF ("Pendapatan Bunga Pinjaman (Nominal)" != #MISSING)
         "Pendapatan Bunga Pinjaman" = "Pendapatan Bunga Pinjaman (Nominal)";
      ELSEIF ("Pendapatan Bunga Pinjaman (KD1)" != #MISSING)
         "Pendapatan Bunga Pinjaman" = "Pendapatan Bunga Pinjaman (KD1)";
      ENDIF;
    )

    /*Pendapatan Administrasi Bunga Pinjaman*/

    "Pendapatan Administrasi Bunga Pinjaman" 
   	(
      IF ("Pendapatan Administrasi Bunga Pinjaman (Nominal)" != #MISSING)
         "Pendapatan Administrasi Bunga Pinjaman" = "Pendapatan Administrasi Bunga Pinjaman (Nominal)";
      ELSEIF ("Pendapatan Administrasi Bunga Pinjaman (KD1)" != #MISSING)
         "Pendapatan Administrasi Bunga Pinjaman" = "Pendapatan Administrasi Bunga Pinjaman (KD1)";
      ENDIF;
    )

    /*Penyertaan Saham - Gain*/

    "Penyertaan Saham - Gain (KD1)" = null;
    "Penyertaan Saham - Gain (KD2)" = null;
    "Penyertaan Saham - Gain (KD3)" = "Non-Performing Loans (%)";

     "Penyertaan Saham - Gain" 
   	(
      IF ("Penyertaan Saham - Gain (Nominal)" != #MISSING)
         "Penyertaan Saham - Gain" = "Penyertaan Saham - Gain (Nominal)";
      ELSEIF ("Penyertaan Saham - Gain (KD1)" != #MISSING)
         "Penyertaan Saham - Gain" = "Penyertaan Saham - Gain (KD1)";
      ENDIF;
    )

    /*Pendapatan Kupon OK*/

    "Pendapatan Kupon OK" 
   	(
      IF ("Pendapatan Kupon OK (Nominal)" != #MISSING)
         "Pendapatan Kupon OK" = "Pendapatan Kupon OK (Nominal)";
      ELSEIF ("Pendapatan Kupon OK (KD1)" != #MISSING)
         "Pendapatan Kupon OK" = "Pendapatan Kupon OK (KD1)";
      ENDIF;
    )

    /*Pendapatan Administrasi Asosiasi*/

     "Pendapatan Administrasi Asosiasi" 
   	(
      IF ("Pendapatan Administrasi Asosiasi (Nominal)" != #MISSING)
         "Pendapatan Administrasi Asosiasi" = "Pendapatan Administrasi Asosiasi (Nominal)";
      ELSEIF ("Pendapatan Administrasi Asosiasi (KD1)" != #MISSING)
         "Pendapatan Administrasi Asosiasi" = "Pendapatan Administrasi Asosiasi (KD1)";
      ENDIF;
    )




ENDFIX;

"""
println("The following calc script was executed by $operation.user.fullName: \n $calcScript")
return calcScript.toString()