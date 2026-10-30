Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Caja Fuerte y Seguridad por Intentos (Encapsulamiento y Control de Bloqueos en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🔐 Simulación de Caja Fuerte y Control de Seguridad (Encapsulamiento y Bloqueos en Java)

Este proyecto es una aplicación en Java que modela un sistema de seguridad para una caja fuerte electrónica con restricciones de intentos fallidos, bloqueo automático por seguridad y opciones de cambio de combinación. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control dinámico de estados y la validación estricta de reglas de seguridad en memoria.

---

# 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`CajaFuerte`**: Modela el dispositivo de seguridad y protege la combinación secreta frente a accesos no autorizados.
* **Atributos privados (`private`)**: `combinación`, `bloqueada` (indicador booleano de estado) e `intentosFallido` (contador de errores), impidiendo la manipulación directa desde fuera de la clase.
* **Constructor**: Inicializa la caja fuerte asignando la clave secreta inicial, fijando el estado de bloqueo en falso y el contador de intentos fallidos en cero.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada si el dispositivo se encuentra bloqueado (`isBloqueada()`).
* **Métodos operativos de negocio**:
* `abrir(String intentoClave)`: Verifica si la caja está bloqueada. Si no lo está, evalúa si el intento coincide con la clave: si es correcto, reinicia los errores y abre el mecanismo; si falla, incrementa el contador de intentos y activa un bloqueo automático al alcanzar o superar los 3 errores consecutivos.
* `cambiarCombinación(String claveActual, String nuevaClave)`: Permite actualizar la clave secreta validando que la caja no esté bloqueada, que la clave actual sea correcta y que la nueva combinación no esté vacía.




* **`Main`**: Punto de entrada del programa. Instancia una caja fuerte con clave predeterminada, simula una secuencia de tres intentos fallidos seguidos (provocando el bloqueo de seguridad), prueba un cuarto intento con la clave correcta (el cual es rechazado por el estado de bloqueo), consulta el estado final y simula un intento de cambio de combinación.

---

# ⚙️ Reglas de Negocio y Control de Validación

1. **Bloqueo Automático por Intentos Fallidos:** Si se acumulan 3 o más errores consecutivos al intentar abrir la caja, el sistema activa una bandera de bloqueo permanente (`bloqueada = true`), impidiendo cualquier apertura o modificación posterior.
2. **Protección de Credenciales Actuales:** Las operaciones críticas (como abrir o cambiar la clave) exigen la validación estricta de la contraseña actual, rechazando operaciones si el sistema está comprometido o bloqueado.
3. **Encapsulamiento Estricto:** Oculta por completo la combinación secreta y el contador interno de fallos, garantizando que el acceso y la manipulación de la seguridad sigan protocolos estrictos.

---

# 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Primer intento ---
Combinación incorrecta

--- Segundo intento ---
Combinación incorrecta

--- Tercer intento ---
Combinación incorrecta
La caja fue bloqueda por seguridad.

--- Cuarto intento ---
Caja fuerte bloqueada.

--- Estado de la caja ---
¿Está bloqueada? true

--- Intento de cambiar combinación ---
Caja fuerte bloqueada, no se puede cambiar la clave.

```

---

# 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado Sensible:** Ocultamiento total de datos críticos de seguridad (contraseñas y contadores de errores) dentro de los límites de la clase.
* **Gestión de Máquina de Estados:** Control riguroso de las transiciones operativas del objeto (operativo vs. bloqueado por seguridad).
* **Diseño Modular:** Clara separación entre la lógica del mecanismo de seguridad (`CajaFuerte`) y la ejecución de casos de prueba (`Main`).
