//package dev.studentform.student.service;
//
//import dev.studentform.student.rpository.StudentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.atomic.AtomicLong;
//import dev.studentform.student.service.MyMongoService;
//@Service
//public class AdmissionNumberService {
//    private static final String ADMISSION_NUMBER_PREFIX = "R-";
//
//    public int num= (int) MyMongoService.getDocumentCount();
////    private static final AtomicLong counter = new AtomicLong(num);
//
//    public String generateAdmissionNumber() {
////        long count = counter.getAndIncrement();
//        String paddedCount = String.format("%03d", num++);
//        return ADMISSION_NUMBER_PREFIX + paddedCount;
//    }
//}
//
