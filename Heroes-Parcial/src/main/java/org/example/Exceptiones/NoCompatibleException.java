package org.example.Exceptiones;
/** * Excepción lanzada cuando un héroe intenta realizar una acción
 * para la cual no tiene la habilidad o interfaz necesaria.
 */
public class NoCompatibleException extends Exception  {
    /** * Excepción lanzada cuando un héroe intenta realizar una acción
     * para la cual no tiene la habilidad o interfaz necesaria.
     */
    public NoCompatibleException(String mensaje) {
        super(mensaje);
    }
}