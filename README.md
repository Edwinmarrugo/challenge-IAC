# Implementación de IaC en entornos de producción

El equipo de TI necesita implementar una solución de infraestructura como código (IaC) para gestionar las infraestructuras de TI y generar entornos de implementación consistentes. Además, se requiere implementar la automatización de escaneo de dependencias, análisis de contenedores, escaneo de secretos y análisis dinámico de seguridad, incluyendo IaC. El objetivo es asegurar que los entornos de producción sean seguros, consistentes y eficientes.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementa IaC en entornos seguros y consistentes |
| **Nivel** | senior-l3 |
| **Tipo** | practical |
| **Tiempo estimado** | 10-12 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diseño del entorno de IaC

**Objetivo:** Definir la arquitectura del entorno de IaC y las herramientas necesarias para su implementación.

**Tiempo estimado:** 2-3 horas

**Instrucciones:**

- Identifica las necesidades del equipo de TI en términos de gestión de infraestructuras.
- Define los componentes y herramientas que se utilizarán para implementar IaC.
- Diseña la arquitectura del entorno de IaC, incluyendo los servicios y recursos necesarios.

**Entregable:** Documento de diseño del entorno de IaC.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las mejores prácticas para la implementación de IaC.
- Evalúa las diferentes herramientas disponibles para IaC y elige la más adecuada para el proyecto.

</details>

### Fase 2: Implementación de la automatización de seguridad

**Objetivo:** Implementar la automatización de escaneo de dependencias, análisis de contenedores, escaneo de secretos y análisis dinámico de seguridad.

**Tiempo estimado:** 3-4 horas

**Instrucciones:**

- Identifica las herramientas y servicios necesarios para implementar la automatización de seguridad.
- Configura los servicios de escaneo de dependencias, análisis de contenedores, escaneo de secretos y análisis dinámico de seguridad.
- Integra estos servicios con el entorno de IaC.

**Entregable:** Entorno de IaC con la automatización de seguridad implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la integración de los servicios de seguridad con el flujo de trabajo de IaC.
- Evalúa las diferentes herramientas disponibles para la automatización de seguridad y elige la más adecuada para el proyecto.

</details>

### Fase 3: Validación y optimización del entorno de IaC

**Objetivo:** Validar el entorno de IaC y optimizar su rendimiento y seguridad.

**Tiempo estimado:** 3-4 horas

**Instrucciones:**

- Realiza pruebas de integración y validación del entorno de IaC.
- Identifica y soluciona cualquier problema de rendimiento o seguridad.
- Optimiza el entorno de IaC para mejorar su eficiencia y seguridad.

**Entregable:** Entorno de IaC validado y optimizado.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la realización de pruebas de carga y estrés para identificar problemas de rendimiento.
- Evalúa la implementación de medidas de seguridad adicionales para mejorar la protección del entorno de IaC.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la infraestructura como código (IaC) y por qué es importante para la gestión de infraestructuras de TI?
- **paraQueSirve**: ¿Para qué sirve la automatización de seguridad en el entorno de IaC?
- **comoSeUsa**: ¿Cómo se integran los servicios de seguridad con el entorno de IaC?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar IaC y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del entorno de IaC en términos de rendimiento y seguridad?

## Criterios de Evaluacion

- Diseño del entorno de IaC.
- Implementación de la automatización de seguridad.
- Validación y optimización del entorno de IaC.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
