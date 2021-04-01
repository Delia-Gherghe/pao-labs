package ro.unibuc.lab7.excpetions.example2.customchecked;


import ro.unibuc.lab7.excpetions.example2.customunchecked.NotFoundException;

public class GradesService {

    public void writeGrades(Object o) throws AccessDeniedException, NotFoundException {
        if (o instanceof Professor) {
            //TODO
            //not related to business
            throw new NotFoundException("Not Found!");
        } else {
            throw new AccessDeniedException("Access denied for students", "alt mesaj");
        }
    }
}
