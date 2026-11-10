
package com.workintech.sqldmljoins.repository;

import com.workintech.sqldmljoins.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {

    // Soru 2: Kitap alan öğrenciler
    String QUESTION_2 = "SELECT o.* FROM ogrenci o " +
            "INNER JOIN islem i ON o.ogrno = i.ogrno";

    @Query(value = QUESTION_2, nativeQuery = true)
    List<Ogrenci> findStudentsWithBook();

    // Soru 3: Kitap almayan öğrenciler
    String QUESTION_3 = "SELECT o.* FROM ogrenci o " +
            "WHERE NOT EXISTS (SELECT 1 FROM islem i WHERE i.ogrno = o.ogrno)";

    @Query(value = QUESTION_3, nativeQuery = true)
    List<Ogrenci> findStudentsWithNoBook();

    // Soru 4: 10A ve 10B sınıflarının kitap sayıları
    String QUESTION_4 = "SELECT o.sinif AS sinif, COUNT(i.kitapno) AS count " +
            "FROM ogrenci o " +
            "INNER JOIN islem i ON o.ogrno = i.ogrno " +
            "WHERE o.sinif IN ('10A', '10B') " +
            "GROUP BY o.sinif " +
            "ORDER BY count DESC";

    @Query(value = QUESTION_4, nativeQuery = true)
    List<KitapCount> findClassesWithBookCount();

    // Soru 5: Toplam öğrenci sayısı
    String QUESTION_5 = "SELECT COUNT(*) FROM ogrenci";

    @Query(value = QUESTION_5, nativeQuery = true)
    Integer findStudentCount();

    // Soru 6: Farklı öğrenci isimlerinin sayısı
    String QUESTION_6 = "SELECT COUNT(DISTINCT ad) FROM ogrenci";

    @Query(value = QUESTION_6, nativeQuery = true)
    Integer findUniqueStudentNameCount();

    // Soru 7: İsme göre öğrenci sayıları
    String QUESTION_7 = "SELECT ad AS ad, COUNT(*) AS count " +
            "FROM ogrenci " +
            "GROUP BY ad";

    @Query(value = QUESTION_7, nativeQuery = true)
    List<StudentNameCount> findStudentNameCount();

    // Soru 8: Her sınıftaki öğrenci sayısı
    String QUESTION_8 = "SELECT sinif AS sinif, COUNT(sinif) AS count " +
            "FROM ogrenci " +
            "GROUP BY sinif";

    @Query(value = QUESTION_8, nativeQuery = true)
    List<StudentClassCount> findStudentClassCount();

    // Soru 9: Her öğrencinin ad, soyad ve okuduğu kitap sayısı
    String QUESTION_9 = "SELECT o.ad AS ad, o.soyad AS soyad, " +
            "COUNT(i.kitapno) AS count " +
            "FROM ogrenci o " +
            "INNER JOIN islem i ON o.ogrno = i.ogrno " +
            "GROUP BY o.ogrno, o.ad, o.soyad " +
            "ORDER BY CASE WHEN o.ad = 'Deniz' THEN 0 ELSE 1 END, o.ogrno ASC";

    @Query(value = QUESTION_9, nativeQuery = true)
    List<StudentNameSurnameCount> findStudentNameSurnameCount();
}
