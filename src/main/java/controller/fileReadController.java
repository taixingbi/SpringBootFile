package controller;
import java.io.*;
import org.apache.commons.io.IOUtils;


import org.springframework.web.bind.annotation.*;

@RestController

public class fileReadController {
    @RequestMapping("/test")
    public String index(){

        return "This is test";
    }

    @GetMapping(value = "/image")
    public @ResponseBody byte[] getImage() throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("/uploads/bike.png");
        return IOUtils.toByteArray(in);
    }
}
