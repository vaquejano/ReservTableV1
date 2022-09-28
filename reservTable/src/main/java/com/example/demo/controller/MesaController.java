
package com.example.demo.controller;

import com.example.demo.model.Mesa;
import com.example.demo.service.MesaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MesaController {
    @Autowired
    private MesaService mesaService;
        
    @GetMapping("/mesas")
    public ResponseEntity<List<Mesa>> listaMesas(){
        return ResponseEntity.status(HttpStatus.OK).body(mesaService.listaMesas());
}
    @GetMapping("mesa/{codmesa}")
    public ResponseEntity<Optional<Mesa>> getByIdMesa(@PathVariable Integer codmesa){
        return ResponseEntity.status(HttpStatus.OK).body(mesaService.getByIdMesa(codmesa));
    }
    @PostMapping("mesa")
    public ResponseEntity<Mesa> salvaMesa(@RequestBody Mesa mesa){
        return ResponseEntity.status(HttpStatus.CREATED).body(mesaService.salvaMesa(mesa));
}
    @PutMapping("mesa")
    public ResponseEntity<Mesa> atualizaMesa(@RequestBody Mesa mesa){
        return ResponseEntity.status(HttpStatus.OK).body(mesaService.atualizaMesa(mesa));
}
    @DeleteMapping("mesa/{codmesa}")
    public ResponseEntity<String> deleteByIdMesa(@PathVariable Integer codmesa){
        mesaService.deleteByIdMesa(codmesa);
        return ResponseEntity.status(HttpStatus.OK).body("Mesa removida com sucesso");
}
}
