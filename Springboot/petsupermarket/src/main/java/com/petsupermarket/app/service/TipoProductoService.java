package com.petsupermarket.app.service;

import java.util.List;
import java.util.Optional;
import com.petsupermarket.app.entity.TipoProducto;

public interface TipoProductoService {

	TipoProducto getUserByTipoProducto(Long id);
	TipoProducto crearTipoProducto(TipoProducto tipoProducto);
	void eliminarTipoProducto(Long id);
	Optional<TipoProducto> actualizarTipoProducto(Long id, TipoProducto tipoProducto);
	static List<TipoProducto> getAllTipoProductos() {
		return null;
	}
}
 
