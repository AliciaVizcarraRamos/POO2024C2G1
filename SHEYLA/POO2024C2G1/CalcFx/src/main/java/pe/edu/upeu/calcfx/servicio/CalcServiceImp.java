package pe.edu.upeu.calcfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pe.edu.upeu.calcfx.dao.CalculadoraDao;
import pe.edu.upeu.calcfx.modelo.CalcTO;

import java.util.ArrayList;
import java.util.List;
@Service
public class CalcServiceImp implements CalcServiceI{
    @Autowired
    CalculadoraDao dbOper;
    //List<CalcTO> dbOper=new ArrayList<CalcTO>();
    @Override
    public void guardarResultados(CalcTO to) {
        dbOper .insertar(to);
    }

    @Override
    public List<CalcTO> obtenerResultados() {
        return dbOper.listar();
    }

    @Override
    public void eliminarResultados(int index) {
        //dbOper.remove(index);

    }

    @Override
    public void actualizarResultados(CalcTO to, int index) {
        //dbOper.set(index, to);

    }
}