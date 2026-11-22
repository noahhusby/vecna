# Vecna

**DBC language support for JetBrains IDEs.**

Vecna provides native support for CAN database (DBC) files in JetBrains IDEs, making it easier to view, edit, and maintain CAN bus communication definitions directly within your development environment.

## Features

- **Syntax Highlighting** — Theme-aware highlighting for DBC keywords, signals, messages, nodes, and values.
- **Language Parsing** — Structured recognition of DBC declarations and syntax.
- **IDE Integration** — Native file type recognition and custom DBC file icons.
- **Color Customization** — Dedicated highlighting categories for DBC language elements.

## Development

Vecna is developed in Kotlin using the IntelliJ Platform SDK, with Grammar-Kit and JFlex for language parsing and tokenization.

### Prerequisites

- Java Development Kit (JDK) compatible with the target IntelliJ Platform
- IntelliJ IDEA
- Gradle (included through the Gradle Wrapper)

### Building

Clone the repository and build the plugin:

```bash
git clone https://github.com/<owner>/vecna.git
cd vecna
./gradlew buildPlugin
```

The packaged plugin will be available under `build/distributions/`.

### Running

Launch a development instance of IntelliJ IDEA with Vecna installed:

```bash
./gradlew runIde
```

This launches a sandbox IDE for testing the plugin without installing it into your primary IDE.

### Lexer and Parser Generation

Vecna uses JFlex to generate its lexer and Grammar-Kit to generate its parser and PSI classes.

The source definitions are located at:

```text
src/main/grammar/
├── Dbc.flex    # JFlex lexer definition
└── Dbc.bnf     # Grammar-Kit parser definition
```

**Generate the lexer**

After modifying `Dbc.flex`, regenerate the lexer:

```bash
./gradlew generateLexer
```

This generates `DbcLexer.java`, which identifies DBC keywords, identifiers, numbers, strings, and punctuation.

**Generate the parser**

After modifying `Dbc.bnf`, regenerate the parser and PSI classes:

```bash
./gradlew generateParser
```

This generates `DbcParser.java`, `DbcTypes.java`, and the associated PSI classes used to represent DBC language structures.

**Regenerate both**

To regenerate both components:

```bash
./gradlew generateLexer generateParser
```

Generated source files should not be edited manually. Instead, modify the corresponding `.flex` or `.bnf` definition and rerun the appropriate task.

## License

See [LICENSE](LICENSE) for license information.