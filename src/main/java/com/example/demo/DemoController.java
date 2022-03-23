package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @PostMapping(value = "/rencana-studi")
    public String daftarRencanaStudi(
            @RequestBody RencanaStudi rencanaStudi
    ){

        return "Berhasil Post";
    }

    @GetMapping(value = "/")
    public String getRequest() {
        return "Bersadadhasil Get";
    }
}
